package com.codecool.dispringdemo.controllers;

import com.codecool.dispringdemo.controller.GetterInjectedController;
import com.codecool.dispringdemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetterInjectedControllerTest {
    
    private GetterInjectedController getterInjectedController;
    
    
    @Before
    public void SetUp() throws Exception {
        this.getterInjectedController = new GetterInjectedController();
        this.getterInjectedController.setGreetingService(new GreetingServiceImpl());
    }
    
    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO, getterInjectedController.sayHello());
    }
}
