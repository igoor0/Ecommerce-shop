package com.igorkohsin.backend.controller;


import com.igorkohsin.backend.exception.ConflictException;
import com.igorkohsin.backend.model.user.User;
import com.igorkohsin.backend.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/registration")
public class RegistrationController {
    @Autowired
    private UserServiceImpl userRegistrationService;

    @PostMapping()
    public ResponseEntity addUser(@RequestBody User user) {
        if (userRegistrationService.getUserByEmail(user.getEmail()) != null) {
            throw new ConflictException("User with email " + user.getEmail() +" already exists");
            //}

            // Hash the password
            //user.setPassword(passwordEncoder.encode(user.getPassword()));

            // Save the user
            //return userRepository.save(user);
        }
        return ResponseEntity.status(HttpStatus.CREATED).build();

    }
}
