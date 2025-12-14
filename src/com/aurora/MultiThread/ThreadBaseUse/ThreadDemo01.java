package com.aurora.MultiThread.ThreadBaseUse;

public class ThreadDemo01 {
    public static void main(String[] args) throws InterruptedException{
        Cat cat = new Cat();

        cat.start();

        System.out.println("主线程继续执行" + Thread.currentThread().getName());

        //可以观察到主线程和cat线程交替执行
        for (int i = 0; i < 60; i++) {
            System.out.println("主线程i = " + i);
            Thread.sleep(1000);
        }
    }
}
