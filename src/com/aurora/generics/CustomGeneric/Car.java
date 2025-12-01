package com.aurora.generics.CustomGeneric;

public class Car {

    //普通方法
    public void run(){

    }

    //泛型方法
    public <T, R> void fly(T t, R r){
        System.out.println(t.getClass());
        System.out.println(r.getClass());
    }
}
