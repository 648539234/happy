package com.test.gogo.Proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoController {
    @Autowired
    private Demo demo2;

    @Autowired
    private CglibProxyExample example;

    @RequestMapping("/fucker")
    public String say(){
        demo2.sayHello("你好");
       /* Demo demo = (Demo)example.getProxy(Demo.class);
        demo.sayHello("gogo");*/
        return "fucker";
    }
}
