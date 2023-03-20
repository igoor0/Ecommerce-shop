package com.igorkohsin.backend.controller;

import com.igorkohsin.backend.webflow.request.AuthenticationRequest;
import com.igorkohsin.backend.webflow.response.AuthenticationResponse;
import com.igorkohsin.backend.service.AuthenticationService;
import com.igorkohsin.backend.webflow.request.RegisterRequest;
import com.igorkohsin.backend.service.LogoutService;
import com.igorkohsin.backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService service;
    private final UserRepository userRepository;
    private final LogoutService logoutService;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(@Valid @RequestBody RegisterRequest request) {
        if (userRepository.existsByEmail(request.getEmail())) {
            return ResponseEntity
                    .badRequest()
                    .body(new AuthenticationResponse("Error: Username is already taken!"));
        } else return ResponseEntity.ok(service.register(request));
    }


    //TODO Check if user exists in database before registration

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate( @Valid @RequestBody AuthenticationRequest request) {
        return ResponseEntity.ok(service.authenticate(request));
    }
}