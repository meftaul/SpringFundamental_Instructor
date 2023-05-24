package com.meftaul.spring.service;

import com.meftaul.spring.domain.User;
import com.meftaul.spring.exception.UserNotFoundException;

import java.util.List;

public class UserService {

    private final List<User> userList = List.of(
            new User(1L, "User1"),
            new User(2L, "User2"),
            new User(3L, "User3"),
            new User(4L, "User4"),
            new User(5L, "User5")
    );

    public List<User> findAll() {
        return userList;
    }

    public User findById(Long userId) {
        return userList.stream()
                .filter(u -> u.id().equals(userId))
                .findFirst()
                .orElseThrow(() -> new UserNotFoundException(String.format("User with id %s is not found", userId)));
    }

    public User findByIdV1(Long userId) {
        for (User user: userList) {
            if (user.id().equals(userId)) {
                return user;
            }
        }

        throw new UserNotFoundException(String.format("User with id %s is not found", userId));
    }

    public boolean existsById(Long userId) {
        return userList.stream().anyMatch(u -> u.id().equals(userId));
    }
}
