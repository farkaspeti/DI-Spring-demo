package com.codecool.dispringdemo.controllers;

import com.codecool.dispringdemo.services.GreetingService;
import com.codecool.dispringdemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    
    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl;
    public GreetingServiceImpl greetingService;
    
    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }
    
}
