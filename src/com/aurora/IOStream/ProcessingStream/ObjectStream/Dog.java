package com.aurora.IOStream.ProcessingStream.ObjectStream;

import java.io.Serializable;

public class Dog implements Serializable {
    private String name;
    private int age;

    // 引用类型属性也需要实现序列化
    private Master master = new Master();

    // static 和 transient 不会被序列化
    private static String nation;   // 静态变量属于类,不属于对象
    private transient String color; // 瞬态变量不会被保存到文件

    // 建议手动添加版本号，提高兼容性
    private static final long serialVersionUID = 1L;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name, int age, String nation, String color) {
        this.name = name;
        this.age = age;
        Dog.nation = nation;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", master=" + master +
                ", color='" + color + '\'' +
                '}';
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

    public Master getMaster() {
        return master;
    }

    public void setMaster(Master master) {
        this.master = master;
    }

    public static String getNation() {
        return nation;
    }

    public static void setNation(String nation) {
        Dog.nation = nation;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
