package com.example.contestapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/about")
@Controller
public class AboutController {

    @GetMapping
    public String about() {
        return "about";
    }
}
