package com.aurora.ReflectionDemo.Introduction;

public class Cat {
    public String name;
    public int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat() {

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

    public void hi() {
        System.out.println("hi");
    }

    public void cry() {
        System.out.println("cry");
    }
}
