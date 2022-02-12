package com.example.contestapp.controller;

import com.example.contestapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/home")
@Controller
public class HomeController {

    @Autowired
   private UserRepository userRepository;

    @GetMapping("")
    public String home() {
        return "home";

    }




}
