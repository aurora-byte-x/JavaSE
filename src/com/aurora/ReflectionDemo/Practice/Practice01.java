package com.aurora.ReflectionDemo.Practice;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Practice01 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException {
        Class<?> cls = Class.forName("com.aurora.ReflectionDemo.Practice.PrivateTest");
        //创建对象实例
        Object o =  cls.newInstance();
        //得到name属性
        Field name = cls.getDeclaredField("name");
        //爆破
        name.setAccessible(true);
        //修改name的值
        name.set(o, "tom");
        //获得getName方法
        Method getName = cls.getMethod("getName");
        //调用getName方法
        System.out.println(getName.invoke(o));
    }
}
