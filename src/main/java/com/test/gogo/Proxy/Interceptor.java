package com.test.gogo.Proxy;

import java.lang.reflect.Method;

/**
 * @Auther: WuYuXiang
 * @Date: 2020/1/8
 * @Description: com.test.gogo
 * @version: 1.0
 */
public interface Interceptor {
    public boolean before(Object proxy, Object target, Method method, Object[] args);
    public void around(Object proxy, Object target, Method method, Object[] args);
    public void after(Object proxy, Object target, Method method, Object[] args);
}
