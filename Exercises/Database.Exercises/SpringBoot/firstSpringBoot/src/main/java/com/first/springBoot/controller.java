package com.first.springBoot;

import com.first.springBoot.firstSpringBoot.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {



    @GetMapping(value = "person1")
    public Person person1(){
        return new Person("Lajos","Laji",122);
    }



}
