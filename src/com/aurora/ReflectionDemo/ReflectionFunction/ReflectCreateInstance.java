package com.aurora.ReflectionDemo.ReflectionFunction;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectCreateInstance {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Class<?> UserCls = Class.forName("com.aurora.ReflectionDemo.ReflectionFunction.User");

        //1.通过反射创建 User 类的对象，使用 public 无参构造。
        User user1 = (User) UserCls.newInstance();
        System.out.println(user1);

        //2.通过反射创建 User 类的对象，使用 public 有参构造。
        Constructor<?> constructor = UserCls.getConstructor(String.class);
        User user2 = (User) constructor.newInstance("tom");
        System.out.println(user2);

        //3.通过反射创建 User 类的对象，使用 private 有参构造 (演示暴破)。
        Constructor<?> constructor1 = UserCls.getDeclaredConstructor(String.class, int.class);  //此处不能使用getDeclared方法，因为getDeclared只能获取public修饰的构造器
        constructor1.setAccessible(true);
        User user3 = (User) constructor1.newInstance("jerry", 99);
        System.out.println(user3);
    }
}
