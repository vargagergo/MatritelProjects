package com.matritel.spring.withspring;

import com.matritel.spring.withspring.shop.ElectricalShop;
import com.matritel.spring.withspring.shop.device.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//Spring starts to scan classes from here, to look for BeanConfigurations
@ComponentScan
public class App {
    public static void main(String[] args) {

        //IoC Container AKA the Application Context
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);

        //Our service, that encapsulates the business logic, so that our main method be nice and clean, without any business logic in it
        //This way the main method can stay ONLY and entry point, and no more
        ElectricalShop bestBuy = context.getBean(ElectricalShop.class);

        //Method call of our Service class, which will call on to other methods
        bestBuy.showAvailableDeviceDetails();


    }
}
