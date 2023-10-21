package com.nbeverton.UserRegistration.controller;

import com.nbeverton.UserRegistration.model.User;
import com.nbeverton.UserRegistration.model.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

        @Autowired
        private UserRepository userRepository;

        // Teste - ok
        @PostMapping("/save")
        public User registerUser(@Valid User user){
            userRepository.save(user);
            return user;
        }

        @GetMapping(path = "/searchAll")
        public Iterable<User> findUser(){
           return userRepository.findAll();
        }

        // Teste - ok
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
        @ResponseStatus(HttpStatus.NO_CONTENT)
        public void deleteUser(@PathVariable int id){
            userRepository.deleteById(id);
        }
}
