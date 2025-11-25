package com.code.demo.service;

import com.code.demo.model.User;
import com.code.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public User create(User user){
        return userRepository.save(user);
    }

    public User update(Long id, User newUser){
        return userRepository.findById(id)
                .map(old ->{
                    old.setName(newUser.getName());
                    old.setAge(newUser.getAge());
                    return userRepository.save(old);
                })
                .orElse(null);
    }

    public boolean delete(Long id){
        if(!userRepository.existsById(id))return false;
        userRepository.deleteById(id);
        return true;
    }

    public User getById(Long id){
        return userRepository.findById(id).orElse(null);
    }
}
