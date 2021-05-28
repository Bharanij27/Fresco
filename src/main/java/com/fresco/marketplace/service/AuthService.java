package com.fresco.marketplace.service;

import com.fresco.marketplace.model.User;
import com.fresco.marketplace.repository.UserHibernateRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private UserHibernateRepository userRepository;

    @Autowired
    private AuthService(UserHibernateRepository userRepository){
        this.userRepository = userRepository;
    }

    public boolean isExists(String username){
        User user = userRepository.findByUsername(username);
        userRepository.findAll().forEach(System.out::println);
        if(user==null){
            return false;
        }
        return true;
    }

    public User authenticateUser(String username,String password){
        User user = userRepository.findByUsername(username);
        if(user.getPassword().equals(password)){
            return user;
        }
        return null;
    } 

    public User registerUser(String username,String password){
        User newUser = new User(username,password);
        return userRepository.save(newUser);
    }

}
