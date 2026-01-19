package com.aurora.ReflectionDemo.ClassDemo;

import java.lang.reflect.Field;

public class ClassMethodsDemo {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        String ClassPath = "com.aurora.ReflectionDemo.ClassDemo.Car";
        //1. 获取Car对应的Class对象
        Class<?> cls = Class.forName(ClassPath);

        //2.输出cls
        System.out.println(cls);    //显示cls对象, 是哪个类的Class对象 com.hspedu.Car
        System.out.println(cls.getClass()); //输出cls运行类型 java.lang.Class

        //3.得到包名
        System.out.println(cls.getPackage().getName());

        //4. 得到全类名
        System.out.println(cls.getName());

        //5. 通过cls创建实例
        Car car = (Car) cls.newInstance();
        System.out.println(car);    //Car{brand='null', price=null},返回的是car.toString

        //6. 通过反射属性获取brand
        Field brand = cls.getField("brand");
        System.out.println(brand.get(car));     //null

        //7. 通过反射给属性赋值
        brand.set(car, "benz");
        System.out.println(brand.get(car)); //benz

        //8. 得到所有的属性
        Field[] fields = cls.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
    }
}
