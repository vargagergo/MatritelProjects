package com.matritel.spring.withspring.shop.config;

import com.matritel.spring.withspring.shop.device.MacBook;
import com.matritel.spring.withspring.shop.device.Memory;
import com.matritel.spring.withspring.shop.device.Processor;
import com.matritel.spring.withspring.shop.device.Storage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Annotation needed to declare Beans in this class
@Configuration
public class ElectricalPartConfig {

    //Methods annotated with @Bean annotation
    //Return Java objects with pre-defines arguments
    //Arguments are needed because:
    //1. different configurations for fast and slow processor for example
    //2. primitive datatypes, no configuration, we cannot simply Autowire it, there is no data behind it
    //Java based configuration, here we need exact instances to be returned
    @Bean(name = "fast")
    public Processor fastProcessor(){
        return new Processor(4, 1400);
    }

    @Bean(name = "slow")
    public Processor slowProcessor(){
        return new Processor(2, 1400);
    }

    @Bean(name = "small")
    public Memory smallMemory(){
        return new Memory(4, 1200);
    }

    @Bean(name = "big")
    public Memory bigMemory(){
        return new Memory(8, 1200);
    }

    @Bean(name = "ssd")
    public Storage ssd(){
        return new Storage("sdd", 128);
    }

    @Bean(name = "hdd")
    public Storage hdd(){
        return new Storage("hdd", 1024);
    }
}
