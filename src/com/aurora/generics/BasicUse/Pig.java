package com.aurora.generics.BasicUse;

public class Pig<E> {
    E e;

    public Pig() {
    }

    public Pig(E e) {
        this.e = e;
    }

    public void show() {
        System.out.println(e.getClass());
    }
}
