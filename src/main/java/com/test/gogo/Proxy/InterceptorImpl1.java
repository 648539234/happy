package com.test.gogo.Proxy;

import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Auther: WuYuXiang
 * @Date: 2020/1/8
 * @Description: com.test.gogo
 * @version: 1.0
 */
@Component("InterceptorImpl1")
public class InterceptorImpl1 implements Interceptor{
    @Override
    public boolean before(Object proxy, Object target, Method method, Object[] args) {
        return false;
    }

    @Override
    public void around(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("gogo");
    }

    @Override
    public void after(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("结束了");
    }
}
