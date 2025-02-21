package com.demoproject.spring_boot_demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//to change the class as a REST API controller, we have added @RestController
@RestController
@RequestMapping("/api/users") // In order to get the request from a url we have used this annotation
public class UserController {

    @GetMapping
    public String getUsers(){
        return "Hello Users";
    }
}
