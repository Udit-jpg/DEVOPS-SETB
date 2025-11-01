package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String showMessage() {
        return "A084 - Udit Set-B DevOps Exam Pet Clinic Application";
    }
}
