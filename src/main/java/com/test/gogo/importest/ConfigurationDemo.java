package com.test.gogo.importest;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Auther: WuYuXiang
 * @Date: 2020/1/16
 * @Description: com.test.gogo.importest
 * @version: 1.0
 */
@Configuration
@Import(SpringAutoConfiguration.class)
public class ConfigurationDemo {
    ConfigurationDemo() throws Exception{
    }
}
