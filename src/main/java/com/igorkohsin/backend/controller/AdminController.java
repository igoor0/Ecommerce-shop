package com.igorkohsin.backend.controller;

import com.igorkohsin.backend.model.USER_ROLE;
import jakarta.annotation.security.RolesAllowed;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Role;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/admin")
public class AdminController {
}
