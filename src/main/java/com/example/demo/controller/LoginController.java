package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//返回String串作为页面链接，生效
public class LoginController {
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}