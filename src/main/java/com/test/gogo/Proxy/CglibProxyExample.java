package com.test.gogo.Proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Auther: WuYuXiang
 * @Date: 2020/1/7
 * @Description: com.maven.test
 * @version: 1.0
 */
@Component
@Scope("prototype")
public class CglibProxyExample implements MethodInterceptor {

    @Autowired
    @Qualifier("InterceptorImpl1")
    private Interceptor interceptor;

    private Object object;

    public Object getProxy(Class cls){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(cls);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("调用真实对象前");
        Object result = methodProxy.invokeSuper(o,objects);
        System.out.println("调用真实对象后");
        return result;
    }
}
