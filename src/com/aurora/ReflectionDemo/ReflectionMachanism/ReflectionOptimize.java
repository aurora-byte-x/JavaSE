package com.aurora.ReflectionDemo.ReflectionMachanism;

import com.aurora.ReflectionDemo.Introduction.Cat;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionOptimize {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {

        //m1();
        //m2();
        m3();
    }

    public static int times = 1000000;
    //传统方式调用Cat的hi方法
    public static void m1(){
        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println("传统方式调用Cat的hi方法" + times + "次耗时：" + (end - start));
    }

    //反射方式调用Cat的hi方法
    public static void m2() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class cls = Class.forName("com.aurora.ReflectionDemo.Introduction.Cat");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");
        long start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("反射方式调用Cat的hi方法" + times + "次耗时：" + (end - start));
    }

    //优化后的反射方式调用Cat的hi方法
    public static void m3() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class cls = Class.forName("com.aurora.ReflectionDemo.Introduction.Cat");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");
        hi.setAccessible(true);
        long start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("优化后的反射方式调用Cat的hi方法" + times + "次耗时：" + (end - start));
    }
}
