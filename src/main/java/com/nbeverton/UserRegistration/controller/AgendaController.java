package com.nbeverton.UserRegistration.controller;

import com.nbeverton.UserRegistration.model.Agenda;
import com.nbeverton.UserRegistration.model.repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping("/agendas")
    public ModelAndView listAgenda(){
        ModelAndView modelAndView = new ModelAndView("indexAgendaShow.html");
        Iterable<Agenda> agenda = agendaRepository.findAll();
        modelAndView.addObject("agendas", agenda);
        return modelAndView;
    }
}
