package com.aurora.ReflectionDemo.ClassDemo;

public class GetClassDemo {
    public static void main(String[] args) throws ClassNotFoundException {

        //1. 方式一：Class.forName
        String ClassPath = "com.aurora.ReflectionDemo.ClassDemo.Car";   //或者通过配置文件读取，此处仅作示例
        Class<?> cls1 = Class.forName(ClassPath);
        System.out.println(cls1);

        //2. 方式二：类名.class
        Class<?> cls2 = Car.class;
        System.out.println(cls2);

        //方式三：对象.getClass()
        Car car = new Car();
        Class<?> cls3 = car.getClass();
        System.out.println(cls3);

        //4. 方式四：类加载器
        ClassLoader classLoader = car.getClass().getClassLoader();
        Class<?> cls4 = classLoader.loadClass(ClassPath);
        System.out.println(cls4);

        //cls1 , cls2 , cls3 , cls4 其实是同一个对象，因为一个类只能有一个class对象
        System.out.println(cls1.hashCode());
        System.out.println(cls2.hashCode());
        System.out.println(cls3.hashCode());
        System.out.println(cls4.hashCode());

        //方式五：基本数据类型.class
        Class<Integer> integerClass = int.class;
        Class<Character> characterClass = char.class;
        Class<Boolean> booleanClass = boolean.class;
        System.out.println(integerClass);   //int

        //6. 方式六：基本数据类型对应的包装类
        Class<Integer> type1 = Integer.TYPE;
        Class<Character> type2 = Character.TYPE;
        System.out.println(type1);

        System.out.println(integerClass.hashCode() == type1.hashCode());    //true
    }
}
