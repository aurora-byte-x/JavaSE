package com.aurora.ReflectionDemo.GetClassInfo;

@Deprecated
public class Person extends A implements IA, IB {
    //属性
    public String name;
    protected static int age;
    String job;
    private double salary;

    //构造器
    public Person() {}

    public Person(String name) {
    }

    public Person(String name, int age) {

    }

    //方法
    public void m1(String name, int age, double salary) {

    }

    protected String m2(){
        return null;
    }

    private void m3(){}
}
