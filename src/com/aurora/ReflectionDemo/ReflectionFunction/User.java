package com.aurora.ReflectionDemo.ReflectionFunction;

public class User {
    private String name = "jack";
    private int age = 10;

    //无参构造器
    public User() {
    }

    //pubLic修饰的有参构造器
    public User(String name) {
        this.name = name;
    }

    //private修饰的有参构造器
    private User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
