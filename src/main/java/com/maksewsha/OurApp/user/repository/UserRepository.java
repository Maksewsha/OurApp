package com.maksewsha.OurApp.user.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private final List<String> userList = new ArrayList<>();
    public List<String> getAll(){
        System.out.println(userList);
        return userList;
    }

    public boolean add(String newUser){
        return userList.add(newUser);
    }
}
