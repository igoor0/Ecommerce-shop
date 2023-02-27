package com.igorkohsin.backend.controller;


import com.igorkohsin.backend.service.RegistrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/registration")
public class RegistrationController {
    @Autowired
    private RegistrationService registrationService;

    //@PostMapping()

}
