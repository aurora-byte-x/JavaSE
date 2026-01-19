package com.aurora.ReflectionDemo.ReflectionFunction;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectVisitMethod {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        //1. 得到Boss类对应的Class对象
        Class<?> bossCls = Class.forName("com.aurora.ReflectionDemo.ReflectionFunction.Boss");

        //2. 创建对象
        Object o = bossCls.newInstance();

        //3. 调用public的hi方法
        Method hi = bossCls.getMethod("hi", String.class);
        hi.invoke(o,"tom");

        //4.调用private方法
        //4.1 得到 say 方法对象
        Method say = bossCls.getDeclaredMethod("say", int.class, String.class, char.class);
        //4.2 因为say方法是private, 所以需要暴破，原理和前面讲的构造器和属性一样
        say.setAccessible(true);
        System.out.println(say.invoke(o, 20, "tom", '男'));
        //4.3 因为say方法是static的，还可以这样调用 ，可以传入null
        System.out.println(say.invoke(null, 30, "mary", '女'));

        //5.在反射中，如果方法有返回值，同意返回Object，但是它的运行类型与方法定义的返回值类型已一致
        Object reVal = say.invoke(null, 18, "jerry", '男');
        System.out.println("reVal的运行类型是: " + reVal.getClass()); //reVal的运行类型是: class java.lang.String

        Method method1 = bossCls.getMethod("method1");
        Object reVal2 = method1.invoke(o);
        System.out.println("reVal2的运行类型是: " + reVal2.getClass());   //reVal2的运行类型是: class com.aurora.ReflectionDemo.ReflectionFunction.Monster
    }
}
