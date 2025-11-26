package com.aurora.set.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("all")
public class MapFor03 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("邓超", "孙俪");
        map.put("王宝强", "马蓉");
        map.put("宋喆", "马蓉");
        map.put("刘令博", null);
        map.put(null, "刘亦菲");
        map.put("鹿晗", "关晓彤");

        //获取所有Entry（键值对）
        Set entrySet = map.entrySet();

        //使用增强for循环遍历
        System.out.println("============使用增强for循环遍历==============");
        for (Object key : entrySet) {
            Map.Entry entry = (Map.Entry) key;
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        //使用迭代器遍历
        System.out.println("============使用迭代器遍历==============");
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
