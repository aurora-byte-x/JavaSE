package com.aurora.generics.CustomGeneric;

import java.util.Arrays;

public class Tiger<T, R, M> {
    private String name;

    //属性使用泛型类型
    private T t;
    private R r;
    private M m;

    //使用泛型的数组不能初始化
    T[] ts;

    public Tiger(String name) {
        this.name = name;
    }

    //构造器使用泛型
    public Tiger(String name, T t, R r, M m, T[] ts) {
        this.name = name;
        this.t = t;
        this.r = r;
        this.m = m;
        this.ts = ts;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //方法使用泛型
    public T getT() {
        return t;
    }

    public void setT(T t) {     //参数使用泛型
        this.t = t;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public T[] getTs() {
        return ts;
    }

    public void setTs(T[] ts) {
        this.ts = ts;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", t=" + t +
                ", r=" + r +
                ", m=" + m +
                ", ts=" + Arrays.toString(ts) +
                '}';
    }
}
