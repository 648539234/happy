package com.test.gogo.configuration;

import com.test.gogo.Proxy.Demo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: WuYuXiang
 * @Date: 2020/1/10
 * @Description: com.test.gogo.configuration
 * @version: 1.0
 */
@Configuration
public class ConfigBean {
    ConfigBean(){
        System.out.println("你吗炸了");
    }

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Demo getBean(Another demo){
        String go = "fuck";
        return new Demo(go);
    }
}
