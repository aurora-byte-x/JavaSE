package com.aurora.ReflectionDemo.ClassDemo;

public class ClassIntroduction {
    public static void main(String[] args) throws ClassNotFoundException {
        //Class类的单例性
        Class cls1 = Class.forName("com.aurora.ReflectionDemo.Introduction.Cat");
        Class cls2 = Class.forName("com.aurora.ReflectionDemo.Introduction.Cat");
        System.out.println(cls1.hashCode() == cls2.hashCode()); //true
    }
}
