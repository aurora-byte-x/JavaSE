package com.aurora.MultiThread.ThreadBaseUse;

public class ThreadExitDemo {
    public static void main(String[] args) throws InterruptedException {
        // 1. 创建并启动子线程
        T t1 = new T();
        t1.start();

        Thread.sleep(10 * 1000);

        // 2. 主线程处理业务（模拟休眠）
        System.out.println("main线程休眠10s...");
        t1.setLoop(false);
    }
}
