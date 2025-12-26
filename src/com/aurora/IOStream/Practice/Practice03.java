package com.aurora.IOStream.Practice;

import java.io.*;
import java.util.Properties;

/**
 * 创建一个dog对象，读取dog.properties用相应的内容完成属性初始化,并输出
 * 将创建的Dog对象,序列化到文件dog.dat 文件
 */
public class Practice03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException{


        //读取dog.properties用相应的内容
        Properties properties = new Properties();
        FileReader fileReader = new FileReader("module3/src/file_test/IOStream/dog.properties");
        properties.load(fileReader);
        String name = properties.getProperty("name") + "";
        int age = Integer.parseInt(properties.getProperty("age"));
        String color = properties.getProperty("color") + "";

        //完成属性初始化
        Dog dog = new Dog(name, age, color);

        System.out.println("dog = " + dog);

        //序列化
        FileOutputStream fileOutputStream = new FileOutputStream("module3/src/file_test/IOStream/dog.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);
        oos.writeObject(dog);

        oos.close();

        //再反序列化读出测试是否序列化成功
        FileInputStream fileInputStream = new FileInputStream("module3/src/file_test/IOStream/dog.dat");
        ObjectInputStream ois = new ObjectInputStream(fileInputStream);
        System.out.println("==============反序列化=============");
        Object object = ois.readObject();
        Dog dog2 = (Dog) object;
        System.out.println("name = " + dog2.getName());
        System.out.println("age = " + dog2.getAge());
        System.out.println("color = " + dog2.getColor());
        ois.close();
    }
}
