package com.codecool.dispringdemo.controller;

import com.codecool.dispringdemo.services.GreetingService;

public class GetterInjectedController {
    public GreetingService greetingService;
    
    public String sayHello() {
        return greetingService.sayGreeting();
    }
    
    public void  setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}

