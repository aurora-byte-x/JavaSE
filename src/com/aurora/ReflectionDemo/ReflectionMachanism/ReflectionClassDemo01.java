package com.aurora.ReflectionDemo.ReflectionMachanism;

import com.aurora.ReflectionDemo.Introduction.Cat;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectionClassDemo01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //1. 使用Properties 类, 可以读写配置文件
        Properties prop = new Properties();
        prop.load(new FileInputStream("module3/src/com/aurora/ReflectionDemo/Introduction/file_test/reflection.properties"));

        String classfullpath = prop.getProperty("classfullpath").toString();
        String methodName = prop.getProperty("method").toString();

        //2. 使用反射机制解决
        //(1) 加载类, 返回Class类型的对象cls
        Class cls = Class.forName(classfullpath);

        //(2) 通过 cls 得到你加载的类 com.aurora.ReflectionDemo.Introduction.Cat 的对象实例
        Object o = cls.newInstance();
        Cat cat = (Cat) o;
        cat.setName("tom");
        cat.setAge(10);

        //(3) 通过 cls 得到你加载的类 com.hspedu.Cat 的 methodName"hi"  的方法对象
        //    即：在反射中，可以把方法视为对象（万物皆对象）
        Method method = cls.getMethod(methodName);

        //(4) 通过method1 调用方法: 即通过方法对象来实现调用方法
        method.invoke(o);   //传统方法 对象.方法() , 反射机制 方法.invoke(对象)

        //(5) java.lang.reflect.Field: 代表类的成员变量, Field对象表示某个类的成员变量
        // getField只能得到public修饰的属性
        Field nameField = cls.getField("name");
        System.out.println("name:" + nameField.get(o));
        Field ageField = cls.getField("age");
        System.out.println("age:" + ageField.get(o));

        //java.lang.reflect.Constructor: 代表类的构造方法, Constructor对象表示构造器
        //()中可以指定构造器参数类型, 返回无参构造器
        Constructor constructor = cls.getConstructor();
        System.out.println("constructor:" + constructor);   //constructor:public com.aurora.ReflectionDemo.Introduction.Cat()

        Constructor constructor2 = cls.getConstructor(String.class, int.class); //constructor2:public com.aurora.ReflectionDemo.Introduction.Cat(java.lang.String,int)
        System.out.println("constructor2:" + constructor2);
    }
}
