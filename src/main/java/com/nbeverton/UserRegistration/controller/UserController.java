package com.nbeverton.UserRegistration.controller;

import com.nbeverton.UserRegistration.model.User;
import com.nbeverton.UserRegistration.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

        @Autowired
        private UserRepository userRepository;

        @PostMapping
        public User registerUser(User user){
            userRepository.save(user);
            return user;
        }
}
