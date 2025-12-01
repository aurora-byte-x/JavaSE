package com.aurora.generics.CustomGeneric;

public class Apple<T,R,M> {
    public <E> void fly(E e){   //泛型方法
        System.out.println(e.getClass().getSimpleName());
    }

//    public void eat(U u){}    //错误，因为U没有声明

    public void run(M m){}
}
