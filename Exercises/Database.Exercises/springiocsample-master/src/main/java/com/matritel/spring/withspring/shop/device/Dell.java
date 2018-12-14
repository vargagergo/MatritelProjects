package com.matritel.spring.withspring.shop.device;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//Component annotation to declare this class as a componenet, so that the Scanning would add it into the context
@Component
public class Dell extends Computer {

    //@Autowired annotation on constructor, to inject dependencies, here: the Processor, Memory, Storage
    @Autowired
    public Dell(@Qualifier(value = "slow") Processor processor,
                @Qualifier(value = "big") Memory memory,
                @Qualifier(value = "hdd") Storage storage) {
        super(processor, memory, storage);
    }
}
