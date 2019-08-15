package com.codecool.dispringdemo;

import com.codecool.dispringdemo.controller.ConstructorInjectedController;
import com.codecool.dispringdemo.controller.GetterInjectedController;
import com.codecool.dispringdemo.controller.MyController;
import com.codecool.dispringdemo.controller.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiSpringDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiSpringDemoApplication.class, args);
    
        MyController controller = (MyController) ctx.getBean("myController");
        
        controller.hello();
    
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }

}
