package com.aurora.ReflectionDemo.Introduction;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class WriteProperties {
    public static void main(String[] args) throws IOException {

        Properties prop = new Properties();
        prop.setProperty("classfullpath", "com.aurora.ReflectionDemo.Introduction.Cat");
        prop.setProperty("method", "hi");

        prop.store(new FileWriter("module3/src/com/aurora/ReflectionDemo/Introduction/file_test/reflection.properties"), "reflection introduction");
        System.out.println("写入配置文件成功");
    }
}
