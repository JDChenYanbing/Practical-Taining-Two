package com.jk.controller;

import com.jk.mapper.UserMapper;
import com.jk.model.User;
import com.jk.service.UserService;
import com.jk.utils.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author ：mmzs
 * @date ：Created in 2019/5/15 16:09
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
public class UserController implements UserService {
    @Autowired
    private UserMapper userMapper;
    @PostMapping("login")
    @ResponseBody
    @Override
    public HashMap<String, Object> login(@RequestBody User user){
        HashMap<String,Object> result = new HashMap<>();


        User userInfo= userMapper.findIntoByloginnumber(user.getLoginnumber());
//判断账号是否存在
        if(userInfo==null) {
            result.put("code", 2);
            result.put("msg", "账号不存在");
            return result;
        }

        //判断前台输入的密码和数据库的是否一致
        String password = user.getPassword();
        String md516 = Md5Util.getMd516(password);
        if(!userInfo.getPassword().equals(md516)) {
            result.put("code", 3);
            result.put("msg", "密码错误");
            return result;
        }
//将用户信息保存到redis中
        //session.setAttribute(session.getId(), userInfo);
       // Long aLong = redisTemplate.opsForList().leftPush(ConstantConf.USER_LOGIN, userInfo);
        result.put("code", 0);
        result.put("msg", "登陆成功");
        return result;
    }
    @PostMapping("reg")
    @ResponseBody
    @Override
    public  Boolean save(@RequestBody User user){
        User userInfo= userMapper.findIntoByloginnumber(user.getLoginnumber());
        if(userInfo!=null){
            return false;
        }else{
            user.setPassword(Md5Util.getMd516(user.getPassword()));
            userMapper.save(user);
            return true;

        }
    }
}
