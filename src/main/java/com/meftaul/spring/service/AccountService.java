package com.meftaul.spring.service;

import com.meftaul.spring.exception.UserNotFoundException;

public class AccountService {

    public UserService userService;

    public AccountService(UserService userService) {
        this.userService = userService;
    }

    public void createAccount(Long userId) {

        if (!userService.existsById(userId)) {
            throw new UserNotFoundException(String.format("User with id %s is not found", userId));
        }

        System.out.println(String.format("Account created for user ID: %s", userId));

    }

}
