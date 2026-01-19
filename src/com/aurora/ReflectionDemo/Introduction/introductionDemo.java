package com.aurora.ReflectionDemo.Introduction;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class introductionDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        //1. 使用Properties 类, 可以读写配置文件
        Properties prop = new Properties();
        prop.load(new FileInputStream("module3/src/com/aurora/ReflectionDemo/Introduction/file_test/reflection.properties"));

        String classfulpath = prop.getProperty("classfullpath").toString();
        String methodName =  prop.getProperty("method").toString();
        System.out.println("classfullpath:" + classfulpath);
        System.out.println("methodName:" + methodName);

        //2. 创建对象 , 传统的方法，行不通 =》 反射机制
        //new classfullpath(); // classfullpath 这是一个字符串，而正规应该new 类名()

        //3. 使用反射机制解决
        //(1) 加载类, 返回Class类型的对象cls
        Class cls = Class.forName(classfulpath);
        //(2) 通过 cls 得到你加载的类 com.hspedu.Cat 的对象实例
        Object o = cls.newInstance();
        System.out.println("o的运行类型" + o.getClass());

        //(3) 通过 cls 得到你加载的类 com.hspedu.Cat 的 methodName"hi"  的方法对象
        //    即：在反射中，可以把方法视为对象（万物皆对象）
        Method method01 = cls.getMethod(methodName);

        //(4) 通过method1 调用方法: 即通过方法对象来实现调用方法
        method01.invoke(o);     //传统方法 对象.方法() , 反射机制 方法.invoke(对象)

    }
}
