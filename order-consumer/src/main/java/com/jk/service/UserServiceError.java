package com.jk.service;

import com.jk.model.User;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * @author ：mmzs
 * @date ：Created in 2019/5/15 16:05
 * @description：
 * @modified By：
 * @version: $
 */
@Component
public class UserServiceError implements UserServiceFeign {
    @Override
    public HashMap<String, Object> login(User user) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("1","网络异常");
        return params;
    }

    @Override
    public Boolean save(User user) {
        return false;
    }
}
