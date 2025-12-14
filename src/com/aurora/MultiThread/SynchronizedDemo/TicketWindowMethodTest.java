package com.aurora.MultiThread.SynchronizedDemo;

public class TicketWindowMethodTest {
    public static void main(String[] args) {
        TicketWindowMethod ticketWindowMethod = new TicketWindowMethod();

        // 关键点：三个线程必须共用同一个 task 对象
        // 这样 synchronized 方法锁住的 this 才是同一个对象
        Thread t1 = new Thread(ticketWindowMethod);
        Thread t2 = new Thread(ticketWindowMethod);
        Thread t3 = new Thread(ticketWindowMethod);

        t1.start();
        t2.start();
        t3.start();
    }
}
