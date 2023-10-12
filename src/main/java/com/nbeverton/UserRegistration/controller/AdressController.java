package com.nbeverton.UserRegistration.controller;

import com.nbeverton.UserRegistration.model.Adress;
import com.nbeverton.UserRegistration.model.repository.AdressRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("adress")
public class AdressController {

    @Autowired
    private AdressRepository adressRepository;

    @PostMapping("save")
    public Adress saveAdress(@Valid Adress adress){
        adressRepository.save(adress);
        return adress;
    }

    @GetMapping("search")
    public Iterable<Adress> getAdress(){
        return adressRepository.findAll();
    }

}
