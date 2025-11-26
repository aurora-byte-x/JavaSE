package com.aurora.set.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@SuppressWarnings("all")
public class MapFor02 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("邓超", "孙俪");
        map.put("王宝强", "马蓉");
        map.put("宋喆", "马蓉");
        map.put("刘令博", null);
        map.put(null, "刘亦菲");
        map.put("鹿晗", "关晓彤");

        //取出所有的value
        Collection valueset = map.values();

        //使用增强for循环遍历
        System.out.println("============使用增强for循环遍历=================");
        for (Object value : valueset) {
            System.out.println(value);
        }

        //使用迭代器遍历
        System.out.println("============使用迭代器遍历=================");
        Iterator iterator = valueset.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }
}
