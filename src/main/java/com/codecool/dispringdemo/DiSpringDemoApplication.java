package com.codecool.dispringdemo;

import com.codecool.dispringdemo.controllers.ConstructorInjectedController;
import com.codecool.dispringdemo.controllers.GetterInjectedController;
import com.codecool.dispringdemo.controllers.MyController;
import com.codecool.dispringdemo.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiSpringDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiSpringDemoApplication.class, args);
    
        MyController controller = (MyController) ctx.getBean("myController");
        
        System.out.println(controller.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }

}
