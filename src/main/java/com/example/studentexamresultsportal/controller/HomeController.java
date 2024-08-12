package com.example.studentexamresultsportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        return "index"; // This should match the name of your Thymeleaf template file
    }
    
    @GetMapping("/index1")
    public String index1(Model model) {
        return "index"; // This should match the name of your Thymeleaf template file
    }
    
    @GetMapping("/index2")
    public String index2(Model model) {
        return "index"; // This should match the name of your Thymeleaf template file
    }
}