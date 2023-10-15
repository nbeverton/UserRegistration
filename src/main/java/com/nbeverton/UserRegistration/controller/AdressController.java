package com.nbeverton.UserRegistration.controller;

import com.nbeverton.UserRegistration.model.Adress;
import com.nbeverton.UserRegistration.model.repository.AdressRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping
    public Adress editAdress(@Valid Adress adress){
        adressRepository.save(adress);
        return adress;
    }

    @DeleteMapping(path = "/delete/{id}")
    public void deleteAdress(@PathVariable int id){
        adressRepository.deleteById(id);
    }

}
