package com.aurora.set.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("all")
public class MapFor01 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("邓超", "孙俪");
        map.put("王宝强", "马蓉");
        map.put("宋喆", "马蓉");
        map.put("刘令博", null);
        map.put(null, "刘亦菲");
        map.put("鹿晗", "关晓彤");

        //先取出所有key
        Set keyset = map.keySet();

        //增强for循环遍历
        System.out.println("===============增强for循环遍历===========");
        for (Object key : keyset) {
            System.out.println(key + ":" + map.get(key));
        }

        //迭代器遍历
        System.out.println("===============迭代器遍历===========");
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println(key + ":" + map.get(key));
        }
    }
}
