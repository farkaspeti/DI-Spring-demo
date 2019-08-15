package com.codecool.dispringdemo.controller;

import com.codecool.dispringdemo.services.GreetingService;

public class ConstructorInjectedController {
    
   public GreetingService greetingService;
    
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    
    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
