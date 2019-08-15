package com.codecool.dispringdemo.controller;

import com.codecool.dispringdemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    
    public GreetingService greetingService;
    
    @Autowired //Not Necessary
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    
    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
