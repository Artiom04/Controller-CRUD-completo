package com.code.demo.controller;

import com.code.demo.model.User;
import com.code.demo.service.UserService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.apache.catalina.realm.UserDatabaseRealm;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/users")
public class UserController {
    
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    // READ ALL
    @GetMapping
    public List<User>getAll(){
        return userService.getAll();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public User getById(@PathVariable Long id){
        return userService.getById(id);
    }

    //CREATE 
    @PostMapping
    public User create(@RequestBody User user){
        return userService.create(user);
    }

    //UPDATE
    @PutMapping("/{id}")
    public User update(@PathVariable Long id,@RequestBody User name){
        return  userService.update(id, name);
    }

    //DELETE
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        return userService.delete(id)
            ? "Utente eliminato"
            : "Utente non trovato";
    }
    
}
