package com.codecool.dispringdemo.controllers;

import com.codecool.dispringdemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class GetterInjectedController {
    public GreetingService greetingService;
    
    public String sayHello() {
        return greetingService.sayGreeting();
    }
    
    @Autowired
    public void setGreetingService(@Qualifier("getterGreetingService")GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}

