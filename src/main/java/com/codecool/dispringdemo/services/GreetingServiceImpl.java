package com.codecool.dispringdemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{
    
    public static final String HELLO = "HELLO";
    
    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
