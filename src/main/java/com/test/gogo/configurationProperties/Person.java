package com.test.gogo.configurationProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.time.Duration;
import java.util.Date;
import java.util.List;

/**
 * @Auther: WuYuXiang
 * @Date: 2020/1/13
 * @Description: com.test.gogo.configurationProperties
 * @version: 1.0
 */
@ConfigurationProperties(prefix = "person.information",ignoreUnknownFields=true)
@Component
@Validated
public class Person {
    private String name;
    private Integer age;
    private Boolean boss;
    private Date birth;
    private List<String> friends;

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

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

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                '}';
    }
}
