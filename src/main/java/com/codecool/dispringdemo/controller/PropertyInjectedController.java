package com.codecool.dispringdemo.controller;

import com.codecool.dispringdemo.services.GreetingServiceImpl;

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;
    
    public String sayHello(){
        return greetingService.sayGreeting();
    }
    
}
