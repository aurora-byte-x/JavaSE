package com.aurora.ReflectionDemo.ReflectionFunction;

public class Boss {
    public int age;
    private static String name;

    public Monster method1() {
        return new Monster();
    }

    //静态方法
    public static String say(int n, String s, char c) {
        return n + " " + s + " " +c;
    }

    //普通public方法
    public void hi(String s) {
        System.out.println( "hi," + s);
    }
}
