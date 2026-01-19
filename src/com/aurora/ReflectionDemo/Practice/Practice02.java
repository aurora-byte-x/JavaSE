package com.aurora.ReflectionDemo.Practice;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Practice02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException, NoSuchMethodException {
        //1.利用Class类的forName方法得到File类的class对象
        Class<?> fileCls = Class.forName("java.io.File");

        //2.在控制台打印File类的所有构造器
        Constructor<?>[] constructors = fileCls.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        //3.通过newInstance的方法创建File对象，并创在同级目录下创建 test.txt文件
        //前面打印所有构造器是发现constructors[1]满足File(String.class),也可以直接使用constructors[0]
        //File file = (File) constructors[1].newInstance("module3/src/com/aurora/ReflectionDemo/Practice/test.txt");
        Constructor<?> constructor = fileCls.getDeclaredConstructor(String.class);
        File file = (File) constructor.newInstance("module3/src/com/aurora/ReflectionDemo/Practice/test.txt");

        Method createNewFile = fileCls.getMethod("createNewFile");
        createNewFile.invoke(file);
        System.out.println("文件创建成功");
    }
}
