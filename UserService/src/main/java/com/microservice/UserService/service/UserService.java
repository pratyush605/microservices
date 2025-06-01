package com.microservice.UserService.service;

import com.microservice.UserService.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User createUser(User user);

    List<User> getAllUsers();

    User getUser(Long id);

    void deleteUser(Long id);

    User updateUser(User user);
}
