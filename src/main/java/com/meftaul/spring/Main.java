package com.meftaul.spring;

import com.meftaul.spring.service.AccountService;
import com.meftaul.spring.service.UserService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        UserService userService = new UserService();
        AccountService accountService = new AccountService(userService);

        /*System.out.println(
                userService.findAll()
        );

        System.out.println("===================");

        System.out.println(
                userService.findByIdV1(2L)
        );

        System.out.println("===================");

        System.out.println(
                userService.findByIdV1(6L)
        );*/

        System.out.println("===================");

        accountService.createAccount(1L);

        System.out.println("===================");

        accountService.createAccount(6L);

    }
}