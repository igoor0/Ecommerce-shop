package com.igorkohsin.backend.controller;

import com.igorkohsin.backend.service.NewsletterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/newsletter")
public class NewsletterController {
    @Autowired
    private NewsletterService newsletterService;
}
