package com.aurora.MultiThread.SynchronizedDemo;

public class TicketWindowMethod implements Runnable {

    private int tickets = 100;

    @Override
    public void run() {
        while (true) {
            if (!sellOneTicket()) {     //sellOneTicket函数返回值为false，即余票为0，不再售票
                System.out.println("票已售完！");
                break;
            }

            try {
                Thread.sleep(5);
            }  catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // --- 同步方法 ---
    // 锁对象默认为 this (即当前的 TicketWindowMethod 实例对象)
    private synchronized boolean sellOneTicket() {
        if (tickets > 0) {
            try {
                Thread.sleep(10);
            }  catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "卖出了一张票，剩余票数：" + (--tickets));
            return true;
        }

        return false;   //无票可卖
    }
}
