package com.aurora.set.ColletionsUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@SuppressWarnings("all")
public class CollectionsDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("tom");
        list.add("smith");
        list.add("king");
        list.add("milan");
        list.add("tom");

        System.out.println("list: " + list);

        //max(Collection)
        System.out.println(Collections.max(list));

        //max(Collection, Comparator)
        Object max = Collections.max(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        System.out.println("max = " + max);

        //min(Comparator)
        System.out.println(Collections.min(list));

        //min(Coleation, Comparator)
        Object min = Collections.min(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        System.out.println("min  = " + min);

        //frequency()
        System.out.println("frequency: " + Collections.frequency(list, "tom"));

        //copy()
        ArrayList dest =  new ArrayList();
        //先给dest填充占位符，负责空间为0，不能正确将list中的元素复制到dest
        for (int i = 0; i < list.size(); i++) {     //这里设置dest的大小与List一样
            dest.add("");
        }
        Collections.copy(dest, list);
        System.out.println("dest: " + dest);

        //replaceALL
        Collections.replaceAll(list, "tom", "汤姆");
        System.out.println("replaceAll: " + list);
    }
}
