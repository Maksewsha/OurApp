package com.maksewsha.OurApp.user.controller;

import com.maksewsha.OurApp.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/create")
    boolean createNewUser(String user){
        return service.createNewUser(user);
    }

    @GetMapping("/all")
    List<String> getAllUsers(){
        return service.getAllUsers();
    }
}
