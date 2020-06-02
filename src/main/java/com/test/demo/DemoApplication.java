package com.test.demo;

import com.test.demo.circleDependency.OrderServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(
        scanBasePackages = {
                "com.test.demo.circleDependency",
                "com.springboot.test.componentscan"
        }
)
@ImportResource("classpath:*.xml")
public class DemoApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        OrderServer order = context.getBean(OrderServer.class);
        order.getAbc();
    }

}



    