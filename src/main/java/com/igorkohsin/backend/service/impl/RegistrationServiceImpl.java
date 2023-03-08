package com.igorkohsin.backend.service.impl;

import com.igorkohsin.backend.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl {
    @Autowired
    private RegistrationRepository registrationRepository;

}
