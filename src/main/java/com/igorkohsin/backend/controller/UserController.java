package com.igorkohsin.backend.controller;

import com.igorkohsin.backend.model.user.User;
import com.igorkohsin.backend.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
    @Autowired
    private UserServiceImpl userServiceImpl;
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userServiceImpl.getAllUsers());
    }

    @GetMapping("/{id}")
    ResponseEntity<User> getUserById(@PathVariable String id) {
        return ResponseEntity.ok(userServiceImpl.getUserById(id));
    }

    @GetMapping("/{email}")
    ResponseEntity<User> getUserByEmail(@PathVariable String email) {

        return ResponseEntity.ok(userServiceImpl.getUserByEmail(email));}


//    @PostMapping
//    public ResponseEntity addUser(@RequestBody User user) {
//        userService.addUser(user);
//        return ResponseEntity.status(HttpStatus.CREATED).build();
//    }


    @PutMapping
    public ResponseEntity<Object> updateUser(@RequestBody User user) {
        userServiceImpl.updateUser(user);
        return ResponseEntity.ok().build();
    }
    @DeleteMapping
    public ResponseEntity deleteAllUsers(){
        userServiceImpl.deleteAllUsers();
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
     @DeleteMapping("/{id}")
    public ResponseEntity deleteUser(@PathVariable String id) {
        userServiceImpl.deleteUser(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    }
