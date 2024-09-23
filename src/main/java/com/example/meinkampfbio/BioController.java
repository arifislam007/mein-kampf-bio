package com.example.meinkampfbio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BioController {

    @GetMapping("/bio")
    public String getBioPage(Model model) {
        model.addAttribute("title", "The Main Kamp Book");
        return "bio"; // Thymeleaf template name
    }
}
