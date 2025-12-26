package com.aurora.IOStream.Practice;

import java.io.Serializable;

/**
 * 创建Dog类，包含属性name, age, color
 * 实现Serializable接口以可序列化
 */
public class Dog implements Serializable {
    private String name;
    private int age;
    private String color;

    private static final long SerialVersionUID = 0L;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
