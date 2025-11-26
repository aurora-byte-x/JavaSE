package com.aurora.set.Map;

import java.util.Properties;

@SuppressWarnings("all")
public class PropertiesDemo01 {
    public static void main(String[] args) {
        Properties properties = new Properties();
//        properties.put(null, "abc");    //NullPointerException
//        properties.put("abc", null);    //NullPointerException

        properties.put("john", 100);
        properties.put("lucy", 100);
        properties.put("lic", 100);
        properties.put("lic", 88);

        System.out.println("properties: " + properties);    //properties: {john=100, lic=88, lucy=100}

        //通过key获取对应值
        System.out.println(properties.get("john")); //100
        System.out.println(properties.getProperty("lucy")); //null

        //删除
        properties.remove("lic");
        System.out.println("properties: " + properties);    //properties: {john=100, lucy=100}

        //修改
        properties.put("john", 999);    //直接添加相同的键覆盖就好了
        System.out.println("properties: " + properties);    //properties: {john=999, lucy=100}
    }
}
