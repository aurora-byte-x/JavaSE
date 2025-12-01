package com.aurora.generics.CustomGeneric;

public interface IUsb<U, R> {
    int n = 10;
//    U name;   不能这样用

    //普通方法中，可以使用接口泛型
    R get(U u);

    void hi(R r);

    void run(R r1, R r2, U u1, U u2);

    //在 JDK8 及以上版本中，接口中的 default (默认) 方法也可以合法地使用接口声明的泛型。
    default R method(U u) {
        return null;
    }
}
