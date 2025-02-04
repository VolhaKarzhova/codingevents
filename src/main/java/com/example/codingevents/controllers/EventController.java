package com.example.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("events")
@Controller
public class EventController {

    private static List <String> events = new ArrayList<>();

    @GetMapping
    public String eventsDisplay(Model model){
        model.addAttribute("events", events);
        return "events/index";
    }

    @GetMapping("create")
    public String renderForm() {
        return "events/create";

    }

    @PostMapping("create")
    public String createEvent(@RequestParam String eventName) {
        events.add(eventName);
        return "redirect:/events";


    }

}
