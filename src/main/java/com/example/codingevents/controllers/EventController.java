package com.example.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RequestMapping("events")
@Controller
public class EventController {

    private static List <String> events = new ArrayList<>();
    private static HashMap <String, String> eventsWithDesc = new HashMap<>();

    @GetMapping
    public String eventsDisplay(Model model){
        model.addAttribute("eventsWithDesc", eventsWithDesc);
        return "events/descriptions";
    }

//    @GetMapping
//    public String eventsWithDescriptionDisplay(Model model) {
//        eventsWithDesc.put("Menteaship","A fun meetup for connecting with mentors");
//        eventsWithDesc.put("Code With Pride","A fun meetup sponsored by LaunchCode");
//        eventsWithDesc.put("Javascripty", "An imaginary meetup for Javascript developers");
//        model.addAttribute("eventsWithDesc", eventsWithDesc);
//        return "events/descriptions";
//    }

    @GetMapping("create")
    public String renderForm() {
        return "events/create";

    }

    @PostMapping("create")
    public String createEvent(@RequestParam String eventName, @RequestParam String eventDesc) {
        eventsWithDesc.put(eventName, eventDesc);
        return "redirect:/events";


    }

}
