package com.aurora.IOStream.ProcessingStream.ObjectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        String filePath = "module3/src/file_test/IOStream/data.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));

        // 读取顺序必须与写入顺序一致！
        int a =  ois.readInt();     //可以定义一个同类变量接收
        System.out.println(a);
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());

        Object object = ois.readObject();   //readObject的返回值类型为Object
        System.out.println("运行类型" + object.getClass()); //实际运行类型还是Dog
        System.out.println(object);

        // 如果要调用子类特有方法，需要向下转型
        Dog dog = (Dog) object;
        System.out.println(dog.getName());

        ois.close();
    }
}
