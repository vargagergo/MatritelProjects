package com.matritel.spring.withoutspring;

import com.matritel.spring.withoutspring.shop.ElectricalShop;
import com.matritel.spring.withoutspring.shop.device.*;

public class App {
    public static void main(String[] args) {

        Processor fastProcessor = new Processor(4, 1400);
        Processor slowProcessor = new Processor(2, 1400);

        Memory smallMemory = new Memory(4, 1200);
        Memory bigMemory = new Memory(8, 1200);

        Storage ssd = new Storage("ssd", 128);
        Storage hdd = new Storage("hdd", 1024);

        MacBook macBook = new MacBook(fastProcessor, smallMemory, ssd);
        Dell dell = new Dell(slowProcessor, bigMemory, hdd);

        ElectricalShop bestBuy = new ElectricalShop(macBook, dell);
        bestBuy.showAvailableDeviceDetails();


    }
}
