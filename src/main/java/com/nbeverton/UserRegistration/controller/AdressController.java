package com.nbeverton.UserRegistration.controller;

import com.nbeverton.UserRegistration.model.Adress;
import com.nbeverton.UserRegistration.model.repository.AdressRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("adress")
public class AdressController {

    @Autowired
    private AdressRepository adressRepository;

    // Teste - ok
    @PostMapping("save")
    public Adress saveAdress(@Valid Adress adress){
        adressRepository.save(adress);
        return adress;
    }

    @GetMapping("search")
    public Iterable<Adress> getAdress(){
        return adressRepository.findAll();
    }


    //Teste - ok
    @GetMapping("search/{id}")
    public Optional<Adress> findAdressById(@PathVariable int id){
        return adressRepository.findById(id);
    }


    @PutMapping
    public Adress editAdress(@Valid Adress adress){
        adressRepository.save(adress);
        return adress;
    }


    // Teste - ok
    @DeleteMapping(path = "/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAdress(@PathVariable int id){
        adressRepository.deleteById(id);
    }

}
