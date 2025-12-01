package com.aurora.generics.BasicUse;

public class Person<E> {
    E s;    //E表示属性s的数据类型，E目前只是一个抽象的类型，该数据类型在定义Person对象的时候指定，即在编译期间，就确定E是什么类型

    public Person(E e) {    //E也可以是参数类型
        this.s = e;
    }

    public E get() {    //E也可以是返回类型
        return s;
    }

    public void set(E e) {
        this.s = e;
    }

    public void show() {
        System.out.println(s.getClass());
    }
}
