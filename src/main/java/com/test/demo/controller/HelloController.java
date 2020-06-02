package com.test.demo.controller;

import com.test.gogo.configurationProperties.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Person person;

    public HelloController(){
        System.out.println("我也启动了");
    }

    @RequestMapping("/hello")
    public String say(){
        System.out.println(person.toString());
        return "lets go";
    }
}
