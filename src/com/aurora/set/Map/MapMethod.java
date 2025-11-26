package com.aurora.set.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("all")
public class MapMethod {
    public static void main(String[] args) {
        Map map = new HashMap();

        //1.put(K key, V value)
        map.put("fh", new Book("", 100));//OK
        map.put("fh", "bnd");//替换-> 一会分析源码
        map.put("fgd", "mr");//OK
        map.put("sgfh", "mr");//OK
        map.put("vcbhhd", null);//OK
        map.put(null, "dfhdfg");//OK
        map.put("lh", "gct");//OK
        map.put("hsp", "hspd");
        System.out.println("map: " + map);  //map: {null=dfhdfg, fh=bnd, fgd=mr, vcbhhd=null, sgfh=mr, hsp=hspd, lh=gct}

        //2.get(Object key)
        System.out.println(map.get("fh"));  //bnd

        //3.remove(Object key)
        map.remove(null);
        System.out.println("map: " + map);  //map: {fh=bnd, fgd=mr, vcbhhd=null, sgfh=mr, hsp=hspd, lh=gct}

        //4.size()
        System.out.println(map.size()); //6

        //5.isEmpty()
        System.out.println(map.isEmpty());  //false

        //6.containsKey(Object key)
        System.out.println(map.containsKey("hsp")); //true

        //7.keySet()
        Set keySetet = map.keySet();
        System.out.println(keySetet);   //[fh, fgd, vcbhhd, sgfh, hsp, lh]

        //8.values()
        Collection collection = map.values();
        System.out.println(collection); //[bnd, mr, null, mr, hspd, gct]

        //9.entrySet()
        Set set = map.entrySet();
        System.out.println(set);    //[fh=bnd, fgd=mr, vcbhhd=null, sgfh=mr, hsp=hspd, lh=gct]

        //10.clear()
        map.clear();
        System.out.println("map: " + map);  //map: {}
    }
}


class Book {
    private String name;
    private int num;

    public Book(String name, int num) {
        this.name = name;
        this.num = num;
    }
}