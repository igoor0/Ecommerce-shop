package com.igorkohsin.backend.excluded;

import com.igorkohsin.backend.service.impl.NewsletterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/newsletter")
public class NewsletterController {
    @Autowired
    private NewsletterServiceImpl newsletterService;
}
