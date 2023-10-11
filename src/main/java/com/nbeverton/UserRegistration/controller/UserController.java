package com.nbeverton.UserRegistration.controller;

import com.nbeverton.UserRegistration.model.User;
import com.nbeverton.UserRegistration.model.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

        @Autowired
        private UserRepository userRepository;

        @PostMapping("/save")
        public User registerUser(@Valid User user){
            userRepository.save(user);
            return user;
        }

        @GetMapping("/search")
        public Iterable<User> findUser(){
           return userRepository.findAll();
        }

        @GetMapping(path = "/search/{id}")
        public Optional<User> findUserById(@PathVariable int id){
            return userRepository.findById(id);
        }

        @GetMapping(path = "/name/{partName}")
        public Iterable<User> findUserByName(@PathVariable String partName){
            return userRepository.findByNameContainingIgnoreCase(partName);
        }

        @PutMapping
        public User editUser(@Valid User user){
            userRepository.save(user);
            return user;
        }

        @DeleteMapping(path = "/delete/{id}")
        public void deleteUser(@PathVariable int id){
            userRepository.deleteById(id);
        }
}
