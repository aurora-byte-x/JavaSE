package com.aurora.set.SetInteface;

import java.util.LinkedHashSet;

@SuppressWarnings("all")
public class LinkedHashSetPractice {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new Car("奥拓", 1000));     //OK
        linkedHashSet.add(new Car("奥迪", 300000));   //OK
        linkedHashSet.add(new Car("法拉利", 10000000));    //OK
        linkedHashSet.add(new Car("奥迪", 300000));   //加入不了
        linkedHashSet.add(new Car("保时捷", 70000000));    //OK
        linkedHashSet.add(new Car("奥迪", 300000));   //加入不了

        System.out.println("linkedHashSet=" + linkedHashSet);
    }
}
