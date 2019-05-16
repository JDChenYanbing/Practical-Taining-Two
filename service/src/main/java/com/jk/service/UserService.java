package com.jk.service;

import com.jk.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;

public interface UserService {
    @PostMapping("login")
    HashMap<String, Object> login(@RequestBody User user);
    @PostMapping("reg")
    Boolean save(@RequestBody User user);
}
