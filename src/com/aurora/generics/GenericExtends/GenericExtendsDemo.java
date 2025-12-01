package com.aurora.generics.GenericExtends;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class GenericExtendsDemo {
    public static void main(String[] args) {
        //类具有继承性
        Object o = new String("hello");

        // --- 1. 泛型的非继承性演示 ---
//        List<Object> list = new ArrayList<String>();  // 编译错误

        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<AA>  list3 = new ArrayList<>();
        List<BB> list4 = new ArrayList<>();
        List<CC> list5 = new ArrayList<>();

        // --- 3. 测试 List<?> (无界通配符) ---
        // 可以接受任何类型的 List
        printCollection1(list1); // √ List<Object>
        printCollection1(list2); // √ List<String>
        printCollection1(list3); // √ List<AA>
        printCollection1(list4); // √ List<BB>
        printCollection1(list5); // √ List<CC>

        // --- 4. 测试 List<? extends AA> (上界通配符) ---
        // 只能接受 AA 或 AA 的子类 (AA, BB, CC)
        // printCollection2(list1); // × List<Object> 是 AA 的父类，不行
        // printCollection2(list2); // × List<String> 与 AA 无关，不行
        printCollection2(list3);    // √ List<AA>
        printCollection2(list4);    // √ List<BB>
        printCollection2(list5);    // √ List<CC>

        // --- 5. 测试 List<? super AA> (下界通配符) ---
        // 只能接受 AA 或 AA 的父类 (AA, Object)
        printCollection3(list1);    // √ List<Object> 是 AA 的父类
        // printCollection3(list2); // × List<String> 不是 AA 的父类
        printCollection3(list3);    // √ List<AA>
        // printCollection3(list4); // × List<BB> 是 AA 的子类，不行（范围太小）
        // printCollection3(list5); // × List<CC> 是 AA 的子类，不行


    }

    /**
     * List<?>: 支持任意泛型类型
     */
    public static void printCollection1(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    /**
     * List<? extends AA>: 上限为 AA
     * 支持 AA 以及 AA 的所有子类
     */
    public static void printCollection2(List<? extends AA> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    /**
     * List<? super AA>: 下限为 AA
     * 支持 AA 以及 AA 的所有父类
     */
    public static void printCollection3(List<? super AA> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
