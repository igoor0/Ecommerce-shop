package com.igorkohsin.backend.service;

import com.igorkohsin.backend.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService{
    @Autowired
    private RegistrationRepository registrationRepository;

}
