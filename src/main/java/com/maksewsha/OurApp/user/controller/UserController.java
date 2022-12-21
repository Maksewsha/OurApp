package com.maksewsha.OurApp.user.controller;

import com.maksewsha.OurApp.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/create")
    boolean createNewUser(@RequestBody String user){
        return service.createNewUser(user);
    }

    @GetMapping("/all")
    List<String> getAllUsers(){
        return service.getAllUsers();
    }
}
