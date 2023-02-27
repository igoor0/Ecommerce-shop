package com.igorkohsin.backend.controller;

import com.igorkohsin.backend.exception.BadRequestException;
import com.igorkohsin.backend.exception.ConflictException;
import com.igorkohsin.backend.model.user.User;
import com.igorkohsin.backend.service.UserService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
    // jwt - token hasz ustalasz i zapisuje obiekt (model) w
    // postaci obiekt jsona w postaci ciagow znakow
    // (to jest algorytm haszujacy)
    //parametr sorted = wyslesz requesta - dorted=alphabetical i posortuje alfabetycznie i wysle posortowane lol
    //w jsonie wysle obiekt posortowany
    @Autowired
    private UserService userService;
    @PostMapping
    public ResponseEntity addUser(@RequestBody User user) {
        userService.addUser(user);
        //Check if the user exists
        if (user.getFirstName() == null || user.getFirstName().trim().length() == 0) {
            throw new BadRequestException("First name is required");
        }
        if (user.getLastName() == null || user.getLastName().trim().length() == 0) {
            throw new BadRequestException("Last name is required");
        }
        if (user.getEmail() == null || user.getEmail().trim().length() == 0) {
            throw new BadRequestException("Email is required");
        }
        if (user.getPassword() == null || user.getPassword().trim().length() == 0) {
            throw new BadRequestException("Password is required");
        }

        // Check if the user already exists
        //if (userService.getUserByEmail(user.getEmail()) != null) {
        //    throw new ConflictException("Username or email already exists");
        //}

        // Hash the password
        //user.setPassword(passwordEncoder.encode(user.getPassword()));

        // Save the user
        //return userRepository.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @PutMapping
    public ResponseEntity<Object> updateUser(@RequestBody User user) {
        userService.updateUser(user);
        return ResponseEntity.ok().build();
    }
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
    @DeleteMapping
    public ResponseEntity deleteAllUsers(){
        userService.deleteAllUsers();
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
    //@GetMapping("/{email}")
    //ResponseEntity<User> getUserByEmail(@PathVariable String email) {return ResponseEntity.ok(userService.getUserByEmail(email));}
    @GetMapping("/{id}")
    ResponseEntity<User> getUserById(@PathVariable String id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }
}
