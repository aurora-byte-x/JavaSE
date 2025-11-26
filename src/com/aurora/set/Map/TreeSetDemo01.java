package com.aurora.set.Map;

import java.util.Comparator;
import java.util.TreeSet;

@SuppressWarnings("all")
public class TreeSetDemo01 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        });

        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("hh");
        treeSet.add("a");
        treeSet.add("abc");     //长度与"tom"同样为3，加不进去

        System.out.println(treeSet);    //[a, hh, tom, jack]
    }
}
