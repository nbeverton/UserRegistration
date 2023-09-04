package com.nbeverton.UserRegistration.controller;

import com.nbeverton.UserRegistration.model.Agenda;
import com.nbeverton.UserRegistration.repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AgendaController {

    @Autowired
    private AgendaRepository agendaRepository;

    @RequestMapping(value = "/agendaShow", method = RequestMethod.GET)
    public String form(){
        return "agenda/formAgenda";
    }

    @RequestMapping(value = "/agendaShow", method = RequestMethod.POST)
    public String form(Agenda agenda){
        agendaRepository.save(agenda);
        return "redirect:/agendaShow";
    }
}
