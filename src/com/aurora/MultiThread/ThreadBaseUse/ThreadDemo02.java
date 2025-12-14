package com.aurora.MultiThread.ThreadBaseUse;

public class ThreadDemo02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        // dog.start(); // ❌错误，Runnable 接口没有 start 方法

        // 创建 Thread 对象，把 dog 对象(实现 Runnable)放入 Thread
        // 这里使用了设计模式 [代理模式]
        Thread thread = new Thread(dog);
        thread.start();
    }
}
