package com.digitalportfolio.SAFportfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignInController {
    @GetMapping("/signin")
    public String signIn(Model model) {
        model.addAttribute("title", "Вход - SAF | Portfolio");
        return "signIn";
    }
}
