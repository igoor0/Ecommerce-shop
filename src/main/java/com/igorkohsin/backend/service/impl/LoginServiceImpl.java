package com.igorkohsin.backend.service.impl;

import com.igorkohsin.backend.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl {

    @Autowired
    private LoginRepository loginRepository;
}
