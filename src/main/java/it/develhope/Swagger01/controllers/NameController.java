package it.develhope.Swagger01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @GetMapping("/name")
    public String myName(){
        return "Karina Alejandra Kosovan";
    }
}
