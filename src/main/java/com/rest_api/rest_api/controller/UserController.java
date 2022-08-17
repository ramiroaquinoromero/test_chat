package com.rest_api.rest_api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest_api.rest_api.entity.User;
import com.rest_api.rest_api.interfaces.UserRepository;

@RestController
@RequestMapping(path="/users")
public class UserController {


    @Autowired
    private UserRepository repo;

    @PostMapping("")
    public User addUser(@RequestBody User val) {
        return repo.save(val);
    }

    @GetMapping("")
    public List<User> listUser(){
        return repo.findAll();
    }

    @GetMapping("/{val}")
    public Optional<User> getUserById(@PathVariable Integer val){
        return repo.findById(val);
    }

    @PutMapping("")
    public User updateUser(@RequestBody User val){
        return repo.save(val);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") Integer id){
        repo.deleteById(id);
        return "Id : " +id+ " delete";
    }
}
