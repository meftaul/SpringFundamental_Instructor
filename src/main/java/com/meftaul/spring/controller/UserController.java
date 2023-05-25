package com.meftaul.spring.controller;

import com.meftaul.spring.domain.User;
import com.meftaul.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /*@ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "Hello world ... :) ";
    }*/

    @ResponseBody
    @GetMapping("/users")
    public List<User> getUserList() {
        return userService.findAll();
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello-world";
    }


}
