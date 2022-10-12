package com.codingsnack.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class HomeController {
    
    @Value("${db.secret}")
    private String secret;

    @GetMapping("/home")
    public String getHome() {
        return "hello world, secret: " + secret;
    }
    
}
