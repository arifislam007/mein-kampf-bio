package com.example.meinkampfbio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BioController {

    @GetMapping("/bio")
    public String getBio(Model model) {
        String bio = "Mein Kampf is a 1925 autobiographical manifesto by Adolf Hitler, where he outlines his political ideology.";
        model.addAttribute("bio", bio);
        return "bio";
    }
}
