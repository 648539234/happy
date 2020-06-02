package com.test.gogo.conditional;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: WuYuXiang
 * @Date: 2020/1/13
 * @Description: com.test.gogo.conditional
 * @version: 1.0
 */
@Configuration

public class ConditionalOnBeanTest {

    @Bean
    @ConditionalOnBean
    public Person getPerson(){
        return new Person("111",12);
    }
}
