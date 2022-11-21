package com.eventer.test.controller;

import com.eventer.test.model.User;
import com.eventer.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class UserController {
    @Autowired
    private UserRepository repo;

    @PostMapping("/login")
    public User create(@RequestBody User user){
        return repo.save(user);
    }
}
