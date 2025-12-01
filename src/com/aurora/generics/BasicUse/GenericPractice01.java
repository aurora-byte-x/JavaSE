package com.aurora.generics.BasicUse;

import java.util.*;

@SuppressWarnings("all")
public class GenericPractice01 {
    public static void main(String[] args) {
        Student tom = new Student("tom", 20);
        Student jack = new Student("jack", 19);
        Student jerry = new Student("jerry", 21);

        //将学生对象放进HashSet
        HashSet<Student> students = new HashSet<Student>();
        students.add(tom);
        students.add(jack);
        students.add(jerry);

        //遍历HashSet
        //方式一：使用迭代器遍历
        System.out.println("==========使用迭代器遍历HashSet============");
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student);
        }

        //方式二：使用增强for循环遍历
        System.out.println("==========使用增强for循环遍历HashSet============");
        for (Student student : students) {
            System.out.println(student);
        }

        //将学生对象放进HashMap
        HashMap<String, Student> studentsMap = new HashMap<String, Student>();
        studentsMap.put(tom.getName(), tom);
        studentsMap.put(jack.getName(), jack);
        studentsMap.put(jerry.getName(), jerry);

        //遍历HashMap
        //方式一：通过EntrySet()遍历
        System.out.println("==========通过EntrySet()遍历HashMap============");
        Set<Map.Entry<String, Student>> studentsSet = studentsMap.entrySet();
        for (Map.Entry<String, Student> entry : studentsSet) {
            System.out.println(entry.getValue());
        }

        //方式二：通过keySet()遍历
        System.out.println("==========通过keySet()遍历HashMap============");
        Set<String> studentsNames = studentsMap.keySet();
        for (String studentName : studentsNames) {
            System.out.println(studentsMap.get(studentName));
        }
    }
}
