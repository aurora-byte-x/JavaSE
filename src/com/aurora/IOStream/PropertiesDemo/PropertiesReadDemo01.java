package com.aurora.IOStream.PropertiesDemo;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReadDemo01 {
    public static void main(String[] args) throws IOException {
        // 1. 创建 Properties 对象
        Properties properties = new Properties();

        // 2. 加载指定文件
        properties.load(new FileReader("module3/src/file_test/properties/mysql.properties"));

        // 3. 把所有键值对显示到控制台
        properties.list(System.out);

        // 4. 根据指定的 key 获取值
        String user = properties.getProperty("user");
        System.out.println("用户名:" + user);
    }
}
