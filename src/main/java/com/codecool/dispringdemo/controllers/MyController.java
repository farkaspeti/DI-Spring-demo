package com.codecool.dispringdemo.controllers;


import com.codecool.dispringdemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    
    private GreetingService greetingService;
    
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    
    public String hello() {
        System.out.println("Hello!");
        
        return greetingService.sayGreeting();
    }
}
