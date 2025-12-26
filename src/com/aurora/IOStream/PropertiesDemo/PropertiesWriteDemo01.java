package com.aurora.IOStream.PropertiesDemo;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesWriteDemo01 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

        // 1. 在内存中设置键值对
        properties.setProperty("ip", "192.168.1.1");
        properties.setProperty("user", "root");
        properties.setProperty("password", "123456");

        // 2. 将数据存储到指定文件
        // 第二个参数是 comments (注释)，如果不写可以传 null
        properties.store(new FileWriter("module3/src/file_test/properties/mysql.properties"), "This is a test config");

        System.out.println("保存配置文件成功");
    }
}
