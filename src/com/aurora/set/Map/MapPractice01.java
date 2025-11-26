package com.aurora.set.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("all")
public class MapPractice01 {
    public static void main(String[] args) {
        Map map = new HashMap();

        //创建员工对象
        Employee tom = new Employee("tom", 1001, 20000);
        Employee jerry = new Employee("jerry", 1002, 10000);
        Employee jack = new Employee("jack", 1003, 19000);

        //添加员工对象至HashMap
        map.put(tom.getNo(), tom);
        map.put(jerry.getNo(), jerry);
        map.put(jack.getNo(), jack);

        //并遍历显示工资>18000的员工(遍历方式最少两种)
        //1.增强for循环遍历Entry
        System.out.println("=============增强for循环遍历Entry===============");
        Set entrySet = map.entrySet();
        for (Object entry : entrySet) {
            Map.Entry item = (Map.Entry) entry;
            Employee employee = (Employee) item.getValue();
            if (employee.getSalary() > 18000) {
                System.out.println(item.getKey() + ":" + item.getValue());
            }
        }

        //2.迭代器遍历Entry
        //Set entrySet = map.entrySet();    //上面写过一次了
        System.out.println("=============迭代器遍历Entry===============");
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry item = (Map.Entry) iterator.next();
            Employee employee = (Employee) item.getValue();
            if (employee.getSalary() > 18000) {
                System.out.println(item.getKey() + ":" + item.getValue());
            }
        }
    }
}
