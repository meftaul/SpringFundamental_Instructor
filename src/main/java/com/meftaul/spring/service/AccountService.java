package com.meftaul.spring.service;

import com.meftaul.spring.exception.UserNotFoundException;
import org.springframework.stereotype.Component;

@Component
public record AccountService(UserService userService) {

    public void createAccount(Long userId) {

        if (!userService.existsById(userId)) {
            throw new UserNotFoundException(String.format("User with id %s is not found", userId));
        }

        System.out.println("Account created for user ID: " + userId);
    }
}
