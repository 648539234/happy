package com.test.gogo.conditional;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

/**
 * @Auther: WuYuXiang
 * @Date: 2020/1/13
 * @Description: com.test.gogo.conditional
 * @version: 1.0
 */
@ConditionalOnProperty(prefix = "application",value = "active",matchIfMissing = false)
@Component
public class ConditionalOnPropertiesTest {
    public ConditionalOnPropertiesTest(){
        System.out.println("我被炸出屎了");
    }
}
