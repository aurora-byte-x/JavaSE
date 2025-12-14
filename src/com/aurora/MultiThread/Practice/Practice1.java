package com.aurora.MultiThread.Practice;

public class Practice1 {
    public static void main(String[] args) {
        A a =  new A();
        B b = new B(a);

        a.start();
        b.start();
    }
}
