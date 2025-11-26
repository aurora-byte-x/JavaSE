package com.aurora.set.SetInteface;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Set linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new String("AA"));
        linkedHashSet.add(456);
        linkedHashSet.add(456);
        linkedHashSet.add(new Customer("liu", 1001));
        linkedHashSet.add(123);
        linkedHashSet.add("HSP");

        System.out.println("linkedHashSet: " + linkedHashSet);
    }
}
