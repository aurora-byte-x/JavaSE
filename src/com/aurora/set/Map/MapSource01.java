package com.aurora.set.Map;

import com.aurora.set.SetInteface.Car;
import com.aurora.set.SetInteface.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("all")
public class MapSource01 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1", "韩顺平");
        map.put("no2", "张无忌");
        map.put(new Car("Audi", 100000), new Person("tom"));

        Set set = map.entrySet();   //得到Entry对象
        System.out.println(set.getClass());

        for (Object obj : set) {
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Set set1 = map.keySet();
        System.out.println(set1.getClass());

        Set set2 = map.entrySet();
        System.out.println(set2.getClass());
    }
}
