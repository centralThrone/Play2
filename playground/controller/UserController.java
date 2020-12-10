package com.playground.controller;

import com.playground.service.QueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    QueueService service;

    @RequestMapping("login")
    public String toLogin(){
        return "login";
    }


}
