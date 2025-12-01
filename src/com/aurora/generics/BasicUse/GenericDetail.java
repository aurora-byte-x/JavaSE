package com.aurora.generics.BasicUse;

import java.util.ArrayList;

@SuppressWarnings("all")
public class GenericDetail {
    public static void main(String[] args) {
        //1.泛型只能是引用类型
        ArrayList<Integer> list = new ArrayList<Integer>();
        //ArrayList<int> list2 = new ArrayList<int>();  //错误

        //2.泛型赋值支持多态
        Pig<A> pig1 = new Pig<A>(new A());
        pig1.show();    //class com.aurora.generics.BasicUse.A
        Pig<A> pig2 = new Pig<A>(new B());
        pig2.show();    //class com.aurora.generics.BasicUse.B

        //3.泛型的简写形式
        ArrayList<Integer> list1 = new ArrayList<>();

        //4.泛型的默认类型（Object）
    }
}
