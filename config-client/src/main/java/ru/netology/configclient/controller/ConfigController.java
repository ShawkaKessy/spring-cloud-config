package ru.netology.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
@EnableAutoConfiguration
public class ConfigController {

    @Value("${user.role}")
    private String role;

    @GetMapping("/role")
    public String getRole() {
        return this.role;
    }
}