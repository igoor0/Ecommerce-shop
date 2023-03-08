package com.igorkohsin.backend.controller;

import com.igorkohsin.backend.service.impl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/login")
public class LoginController {
    @Autowired
    private LoginServiceImpl loginService;
}
