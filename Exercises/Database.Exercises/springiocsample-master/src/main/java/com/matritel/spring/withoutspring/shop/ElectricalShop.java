package com.matritel.spring.withoutspring.shop;

import com.matritel.spring.withoutspring.shop.device.Dell;
import com.matritel.spring.withoutspring.shop.device.MacBook;

public class ElectricalShop {

    private MacBook macBook;
    private Dell dell;

    public ElectricalShop(MacBook macBook, Dell dell) {
        this.macBook = macBook;
        this.dell = dell;
    }

    public void showAvailableDeviceDetails(){
        macBook.showProperties();
        dell.showProperties();
    }
}
