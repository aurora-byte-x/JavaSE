package com.aurora.set.ColletionsUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@SuppressWarnings("all")
public class CollectionsSort {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("tom");
        list.add("smith");
        list.add("king");
        list.add("milan");
        list.add("tom");

        System.out.println("list: " + list);    //list: [tom, smith, king, milan, tom]

        //reverse()
        Collections.reverse(list);
        System.out.println("reverse: " + list);     //reverse: [tom, milan, king, smith, tom]

        //shuffle()
        Collections.shuffle(list);
        System.out.println("shuffled: " + list);    //shuffled: [king, smith, tom, milan, tom]

        //sort(List)
        Collections.sort(list);
        System.out.println("sorted: " + list);      //sorted: [king, milan, smith, tom, tom]

        //sort(List, Comparator)
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        System.out.println("sorted(Comparator): " + list);      //sorted(Comparator): [tom, tom, king, milan, smith]

        //swap()
        Collections.swap(list, 1, 2);
        System.out.println("swap: " + list);    //swap: [tom, king, tom, milan, smith]
    }
}
