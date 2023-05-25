package com.meftaul.spring.controller;

import com.meftaul.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /*@ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "Hello world ... :) ";
    }*/

    @GetMapping("/hello")
    public String hello() {
        return "hello-world";
    }


}
