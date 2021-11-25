package com.shawntime.springframework.simple;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class User {

    private int age;

    private String userName;

    public User(int age, String userName) {
        this.age = age;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("age", age)
                .append("userName", userName)
                .toString();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
