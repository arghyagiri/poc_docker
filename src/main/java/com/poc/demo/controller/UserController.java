package com.poc.demo.controller;

import com.poc.demo.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public ResponseEntity<User> getUsers(){
        return ResponseEntity.ok(User.builder().name("Anthony").age(80L).build());
    }
}
