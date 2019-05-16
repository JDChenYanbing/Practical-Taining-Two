package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：mmzs
 * @date ：Created in 2019/5/15 16:53
 * @description：
 * @modified By：
 * @version: $
 */
@Controller
@RequestMapping("page")
public class PageController {
    @RequestMapping("toreg")
    public String toreg(){
        return "reg";
    }
    /**
     * 跳登陆界面
     * @return
     */
    @RequestMapping("tologin")
    public String tologin(){
        return "login";
    }
    @RequestMapping("tomain")
    public String tomain(){
        return "main";
    }
}
