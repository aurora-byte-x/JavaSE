package com.aurora.generics.CustomGeneric;

@SuppressWarnings("all")
public class CustomGenericDemo01 {
    public static void main(String[] args) {

        //T=Double, R=String, M=Integer
        Tiger<Double, String, Integer> tiger = new Tiger<>("tom", 19.99, "aaa", 100, new Double[]{1.0, 2.0});
        System.out.println("tiger: " + tiger.toString());

//        tiger.setT("yy");     //类型不对，T实际为Double类型

        Tiger tiger2 = new Tiger<>("jerry");
        tiger2.setT("yy");  //可以，在因为创建对象时没有指定泛型类型，编译器会将其默认为 Object，String是Object的子类
        System.out.println("tiger2: " + tiger2.toString());
    }
}
