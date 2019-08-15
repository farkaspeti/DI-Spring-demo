package com.codecool.dispringdemo.services;


import org.springframework.stereotype.Service;

@Service
public class PrimaryGreetingService implements GreetingService {
    
    @Override
    public String sayGreeting() {
        return "Hello form the PrimaryGreetingService";
    }
}
