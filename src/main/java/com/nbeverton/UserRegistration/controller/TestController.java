package com.nbeverton.UserRegistration.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

@GetMapping(path = "/welcome")
    public String helloUser(){
        return "User Registration 2.0";
    }
}
