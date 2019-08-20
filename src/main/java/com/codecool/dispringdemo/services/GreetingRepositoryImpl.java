package com.codecool.dispringdemo.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    
    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting Service";
    }
    
    @Override
    public String getSpainGreeting() {
        return "Servicio de Saludo Primario";
    }
    
    @Override
    public String getGermanGreeting() {
        return "Primärer Grußdienst";
    }
}
