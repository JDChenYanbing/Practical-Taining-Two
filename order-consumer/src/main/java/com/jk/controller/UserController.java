package com.jk.controller;

import com.jk.model.User;
import com.jk.service.UserServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

/**
 * @author ：mmzs
 * @date ：Created in 2019/5/15 16:01
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
public class UserController {
    @Autowired
    private UserServiceFeign userServiceFeign;
    @PostMapping("login")
    public HashMap<String, Object> login(User user){
        return userServiceFeign.login(user);
    }
    //注册
    @PostMapping("reg")
    public Boolean reg(User user) {
        try {

            return userServiceFeign.save(user);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
