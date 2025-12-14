package com.aurora.MultiThread.ThreadMethod;

public class ThreadMethod01 {
    public static void main(String[] args) throws InterruptedException {
        //创建子线程
        T t = new T();

        //测试方法
        t.setName("aurora");    //设置名称
        t.setPriority(Thread.MIN_PRIORITY);     //设置优先级
        t.start();      //启动子线程

        // 主线程逻辑
        for(int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("hi " + i);
        }

        System.out.println(t.getName() + "线程的优先级 = " + t.getPriority());

        // 关键点：中断 t 线程的休眠
        // 执行此句后，t 线程的 sleep 会抛出 InterruptedException
        t.interrupt();
    }
}
