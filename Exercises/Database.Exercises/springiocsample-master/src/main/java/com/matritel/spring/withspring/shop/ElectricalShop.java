package com.matritel.spring.withspring.shop;

import com.matritel.spring.withspring.shop.device.Dell;
import com.matritel.spring.withspring.shop.device.MacBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Component annotation to declare this class as a component, so that the Scanning would add it into the context
//Annotation based configuration, everything is done in the background only thing that is needed is the annotation itself
@Component
public class ElectricalShop {

    //private fields of ElectricalShop
    private MacBook macBook;
    private Dell dell;

    //@Autowired annotation on constructor, to inject dependencies, here: the MacBook, and Dell instances
    @Autowired
    public ElectricalShop(MacBook macBook, Dell dell) {
        this.macBook = macBook;
        this.dell = dell;
    }

    //public methods, that calls both instances' methods
    public void showAvailableDeviceDetails(){
        macBook.showProperties();
        dell.showProperties();
    }
}
