package com.test.gogo.importest;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Auther: WuYuXiang
 * @Date: 2020/1/17
 * @Description: com.test.gogo.importest
 * @version: 1.0
 */
@ConfigurationProperties(prefix="abc")
@Component
public class StaticClass {
    private Map<String,String> map;

}
