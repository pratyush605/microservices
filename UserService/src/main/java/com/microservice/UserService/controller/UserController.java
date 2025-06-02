package com.microservice.UserService.controller;

import com.microservice.UserService.model.User;
import com.microservice.UserService.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/createUser")
    public ResponseEntity<?> createUser(@RequestBody User user) {
        userService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @GetMapping("/getUser/{userID}")
    public ResponseEntity<?> singleUser(@PathVariable("userID") Long id) {
        User user = userService.getUser(id);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/deleteUser/{userID}")
    public ResponseEntity<?> deleteUser(@PathVariable("userID") Long id) {
        userService.deleteUser(id);
        return ResponseEntity.ok("User successfully deleted!!!");
    }

    @PostMapping("/updateUser/{id}")
    public ResponseEntity<?> updateUser(@RequestBody User user, @PathVariable("id") Long id) {
        User oldUser = userService.getUser(id);
        oldUser.setEmail(user.getEmail());
        oldUser.setName(user.getName());
        userService.updateUser(oldUser);
        return ResponseEntity.ok(oldUser);
    }

    @GetMapping("/getAllUsers")
    public ResponseEntity<?> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }
}
