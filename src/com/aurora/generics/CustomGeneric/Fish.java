package com.aurora.generics.CustomGeneric;

public class Fish<T, R> {

    //普通方法
    public void run(){

    }

    //泛型方法
    public <U, M> void eat(U u, M m){
        System.out.println(u.getClass());
        System.out.println(m.getClass());
    }

    //使用了泛型的方法（不是泛型方法，使用的是类声明的泛型）
    public void hi(T t){

    }

    //泛型方法既可以使用类声明的泛型，也可以使用自己声明的泛型
    public <K> void hello(R r, K k){
        System.out.println(r.getClass());
        System.out.println(k.getClass());
    }
}
