package com.aurora.IOStream.ProcessingStream.ObjectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        String filePath = "module3/src/file_test/IOStream/data.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));

        // 1. 序列化基本数据类型
        oos.writeInt(100);          // int -> Integer
        oos.writeBoolean(true);     // boolean -> Boolean
        oos.writeChar('a');         // char -> Character
        oos.writeDouble(9.5);       // double -> Double
        oos.writeUTF("hello");      // String

        // 2. 序列化对象
        oos.writeObject(new Dog("tom", 10, "China", "black"));

        oos.close();
        System.out.println("数据序列化并保存完毕！");
    }
}
