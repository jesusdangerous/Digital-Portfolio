package com.digitalportfolio.SAFportfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {

    @GetMapping("/")
    public String mainPage(Model model) {
        model.addAttribute("title", "SAF | Portfolio");
        return "mainPage";
    }

}