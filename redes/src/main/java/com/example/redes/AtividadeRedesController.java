package com.example.redes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AtividadeRedesController {

    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }
}