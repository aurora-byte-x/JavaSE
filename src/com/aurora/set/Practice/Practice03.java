package com.aurora.set.Practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("all")
public class Practice03 {
    public static void main(String[] args) {
        Map m =  new HashMap();
        m.put("jack", 650);
        m.put("tom", 1200);
        m.put("smith", 2900);
        System.out.println(m);

        //将jack的工资更改为2600元
        m.put("jack", 2600);
        System.out.println(m);

        //为所有员工工资加薪100元
        for (Object key : m.keySet()) {
            m.put(key, (Integer) m.get(key) + 100);
        }
        System.out.println(m);

        //遍历集合中所有的员工
        for (Object key : m.keySet()) {
            System.out.println(key);
        }

        //历集合所有的工资
        for (Object value : m.values()) {
            System.out.println(value);
        }

        //  遍历集合中所有的员工及对应工资
        Set entrySet = m.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
