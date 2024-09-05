package com.example.deployproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("deploy")
public class DeployController {

    Map<String, String> users = new HashMap<>();

    @GetMapping
    public Map<String, String> getAllUsers(){
        buildUsers();
        return users;
    }

    private void buildUsers() {
        users.put("Ali", "Hey!");
        users.put("Haider", "How are you!");
    }

    @GetMapping("hello")
    public String helloWorld(){
        return "Hello, World!";
    }
}
