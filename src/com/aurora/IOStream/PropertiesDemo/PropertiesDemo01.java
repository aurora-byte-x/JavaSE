package com.aurora.IOStream.PropertiesDemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PropertiesDemo01 {
    public static void main(String[] args) throws IOException {
        /**
         * 演示传统方法读取配置文件的局限性
         */
        String filePath = "module3/src/file_test/properties/mysql.properties";
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            //获得ip的值
            String[] split = line.split("=");
            //System.out.println(line);
            if ("ip".equals(split[0])) {
                String ip = split[1];
                System.out.println("ip地址为：" + ip);
            }
        }


        bufferedReader.close();
    }
}
