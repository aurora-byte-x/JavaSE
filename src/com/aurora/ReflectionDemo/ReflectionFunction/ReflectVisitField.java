package com.aurora.ReflectionDemo.ReflectionFunction;

import java.lang.reflect.Field;

public class ReflectVisitField {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        //1. 得到Student类对应的 Class对象
        Class<?> StudentCls = Class.forName("com.aurora.ReflectionDemo.ReflectionFunction.Student");

        //2. 创建对象
        Student student = (Student) StudentCls.newInstance();

        //3. 使用反射得到public age 属性对象
        Field age = StudentCls.getField("age");
        age.set(student, 20);   //通过反射来操作属性
        System.out.println(student);    //Student{age=20, name='null'}
        System.out.println(age.get(student));   //20

        //4. 使用反射操作private static name 属性
        Field name = StudentCls.getDeclaredField("name");
        //对name 进行暴破, 可以操作private 属性
        name.setAccessible(true);
        name.set(null, "tom");  // 因为name是static属性，在类加载的时候就已经有了，因此 student 也可以写出null
        System.out.println(student);    //Student{age=20, name='tom'}
        System.out.println(name.get(student));  //tom
        System.out.println(name.get(null)); //获取属性值, 必须要求name是static tom
    }
}
