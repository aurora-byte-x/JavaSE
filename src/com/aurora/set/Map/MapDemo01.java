package com.aurora.set.Map;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
public class MapDemo01 {
    public static void main(String[] args) {
        Map map = new HashMap();

        //添加元素
        map.put("no1", "韩顺平");
        map.put("no2", "张无忌");//k-v
        map.put("no1", "张三丰");//当有相同的k , 就等价于替换.
        map.put("no3", "张三丰");//k-v
        map.put(null, null); //k-v
        map.put(null, "abc"); //等价替换
        map.put("no4", null); //k-v
        map.put("no5", null); //k-v
        map.put(1, "赵敏");//k-v
        map.put(new Object(), "金毛狮王");//k-v

        System.out.println(map.get("no2"));

        System.out.println("map: " + map);
    }
}
