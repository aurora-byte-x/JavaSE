package com.aurora.set.Map;

import java.util.Comparator;
import java.util.TreeMap;

@SuppressWarnings("all")
public class TreeMapDemo01 {
    public static void main(String[] args) {
        //示例1：使用默认排序
        TreeMap scores = new TreeMap();
        scores.put(98, "Math");
        scores.put(85, "English");
        scores.put(100, "Physics");
        scores.put(100, "Computer");    //key重复，原来对应的value被覆盖

        //输出结果自动按key升序
        System.out.println(scores);     //{85=English, 98=Math, 100=Physics}

        //示例二：自定义排序
        TreeMap salary = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();     //按照key的长度升序排列
            }
        });

        salary.put("Alice", 5000);
        salary.put("Bob", 8000);
        salary.put("Charlie", 6000);

        System.out.println(salary);     //{Bob=8000, Alice=5000, Charlie=6000}
    }
}
