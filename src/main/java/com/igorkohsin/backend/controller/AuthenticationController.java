package com.igorkohsin.backend.controller;

import com.igorkohsin.backend.model.user.User;
import com.igorkohsin.backend.webflow.request.AuthenticationRequest;
import com.igorkohsin.backend.webflow.response.RegisterResponse;
import com.igorkohsin.backend.service.auth.AuthenticationService;
import com.igorkohsin.backend.webflow.request.RegisterRequest;
import com.igorkohsin.backend.service.auth.LogoutService;
import com.igorkohsin.backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService service;
    private final UserRepository userRepository;
    private final LogoutService logoutService;

    @PostMapping("/register")
    public ResponseEntity<RegisterResponse> register(@Valid @RequestBody RegisterRequest request) {
        if (userRepository.existsByEmail(request.getEmail())) {
            return ResponseEntity
                    .badRequest()
                    .body(new RegisterResponse("","Email is already registered!"));
        } else return ResponseEntity.ok(service.register(request));
    }


    @PostMapping("/authenticate")
    public ResponseEntity<RegisterResponse> authenticate(@Valid @RequestBody AuthenticationRequest request) {
        if (!userRepository.existsByEmail(request.getEmail())) {
            return ResponseEntity
                    .badRequest()
                    .body(new RegisterResponse("", "Email doesn't exist"));
        } Optional<User> user = userRepository.findByEmail(request.getEmail());
        boolean isPasswordCorrect = service.verifyPassword(request.getPassword(), service.getPassword(request.getEmail()));

        if (!isPasswordCorrect) {
            return ResponseEntity.badRequest().body(new RegisterResponse("", "Incorrect password"));
        }

        return ResponseEntity.ok(service.authenticate(request));
    }
}