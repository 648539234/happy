package com.test.gogo.conditional;

/**
 * @Auther: WuYuXiang
 * @Date: 2020/1/13
 * @Description: com.test.gogo.conditional
 * @version: 1.0
 */

public class Person {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
        System.out.println("我进来了");
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
