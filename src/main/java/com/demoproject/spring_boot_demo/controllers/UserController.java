package com.demoproject.spring_boot_demo.controllers;

import com.demoproject.spring_boot_demo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

//to change the class as a REST API controller, we have added @RestController
@RestController
@RequestMapping("/api/users") // In order to get the request from a url we have used this annotation
public class UserController {

//    @GetMapping
//    public String getUsers(){
//        return "Hello Users";
//    }


    @GetMapping
    public List<User> getUsers(){
        return Arrays.asList(
                new User(1L, "John", "john@email.com"),
                new User(2L, "Joe", "joe@email.com"),
                new User(3L, "Alice", "alice@email.com")
        );
    }
}
