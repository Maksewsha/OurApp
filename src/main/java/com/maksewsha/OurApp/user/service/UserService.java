package com.maksewsha.OurApp.user.service;

import com.maksewsha.OurApp.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<String> getAllUsers(){
        return repository.getAll();
    }

    public boolean createNewUser(String newUser){
        return repository.add(newUser);
    }
}
