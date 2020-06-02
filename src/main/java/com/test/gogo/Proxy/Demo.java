package com.test.gogo.Proxy;

/**
 * @Auther: WuYuXiang
 * @Date: 2019/12/17
 * @Description: JDK8.demo
 * @version: 1.0
 */
public class Demo {
    private String name;
    public Demo(String name){
        this.name = name;
        System.out.println( name + "DEMO活了");
    }
    public void sayHello(String str){
        System.out.println(str+name);
    }
    public void init(){
        System.out.println("初始化成功");
    }
    public void destroy(){
        System.out.println("销毁成功");
    }
}
