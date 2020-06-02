package com.test.demo.circleDependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.function.Supplier;

/**
 * @Auther: WuYuXiang
 * @Date: 2020/3/2
 * @Description: com.test.demo.circleDependency
 * @version: 1.0
 */
@Service
public class OrderServer {
  
    private Map<String,String> redirectUrl;
    @Autowired
    @Qualifier("happy")
    private Map<String,String> abc;

    public Map<String, String> getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(Map<String, String> redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public Map<String, String> getAbc() {
        return abc;
    }

    public void setAbc(Map<String, String> abc) {
        this.abc = abc;
    }
}
