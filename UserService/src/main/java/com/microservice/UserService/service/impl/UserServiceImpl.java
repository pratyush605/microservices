package com.microservice.UserService.service.impl;

import com.microservice.UserService.exceptions.ResourceNotFoundException;
import com.microservice.UserService.model.User;
import com.microservice.UserService.repository.UserRepo;
import com.microservice.UserService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;
    @Override
    public User createUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public User getUser(Long id) {
        return userRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "User with the given id is not found on the server !! : "+id
                ));
    }

    @Override
    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public User updateUser(User user) {
        return userRepo.save(user);
    }
}
