package com.aurora.generics.BasicUse;

import java.util.ArrayList;
import java.util.Comparator;

@SuppressWarnings("all")
public class GenericPractice02 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        Employee tom = new Employee("tom", 8888.88, new MyDate(2001, 1, 11));
        Employee jack = new Employee("jack", 16666.66, new MyDate(1998, 6, 6));
        Employee jerry = new Employee("tom", 13333.33, new MyDate(2001, 1, 10));

        employees.add(tom);
        employees.add(jack);
        employees.add(jerry);

        System.out.println("===========排序前===========");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        //排序
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int nameCompare = o1.getName().compareTo(o2.getName());
                if (nameCompare != 0) {
                    return nameCompare;
                }

                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });

        System.out.println("=============排序后=============");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }
}
