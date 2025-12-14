package com.aurora.MultiThread.ThreadBaseUse;

public class ThreadDemo03 {
    public static void main(String[] args) {
        PrintHello hello = new PrintHello();
        PrintHi hi = new PrintHi();

        Thread t1 = new Thread(hello);
        Thread t2 = new Thread(hi);
        t1.start();
        t2.start();
    }
}
