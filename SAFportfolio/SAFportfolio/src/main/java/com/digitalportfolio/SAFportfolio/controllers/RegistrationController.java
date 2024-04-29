package com.digitalportfolio.SAFportfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationController {
    @GetMapping("/registration")
    public String register(Model model) {
        model.addAttribute("title", "Регистрация - SAF | Portfolio");
        return "register";
    }
}
