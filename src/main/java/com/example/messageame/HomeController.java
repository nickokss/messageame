package com.example.messageame;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "index"; // Esto asume que tienes un archivo "index.html" en la carpeta src/main/resources/templates
    }
}
