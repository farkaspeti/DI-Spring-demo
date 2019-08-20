package com.codecool.dispringdemo.controllers;


import com.codecool.dispringdemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {
    
    private PropertyInjectedController propertyInjectedController;
    
    
    @Before
    public void SetUp() throws Exception {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    }
    
    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO, propertyInjectedController.sayHello());
    }
}
