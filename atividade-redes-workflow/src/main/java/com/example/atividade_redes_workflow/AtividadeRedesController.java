package com.example.atividade_redes_workflow;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AtividadeRedesController {

    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }
}