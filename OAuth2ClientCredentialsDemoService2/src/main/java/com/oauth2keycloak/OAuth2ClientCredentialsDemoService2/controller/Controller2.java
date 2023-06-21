package com.oauth2keycloak.OAuth2ClientCredentialsDemoService2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller2 {

    @GetMapping("/microservice2/home")
    @ResponseStatus(HttpStatus.OK)
    public String hello() {
        return "Hello from Microservice2";
    }
}
