package com.aurora.MultiThread.SynchronizedDemo;

public class TicketWindowBlock implements Runnable{
    private int tickets = 100;  //共享资源
    private final Object lock = new Object();   //显示锁对象

    @Override
    public void run() {
        while (true) {
            // --- 同步代码块 ---
            // 只有拿到 lock 锁的线程才能进入
            synchronized (lock) {
                if (tickets > 0) {
                    //模拟延迟
                    try {
                        Thread.sleep(10);
                    }  catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "卖出了一张票，剩余" + (--tickets));
                } else {
                    System.out.println("票卖完了");
                    break;
                }
            }
            // --- 同步结束，锁释放 ---

            //休眠几毫秒。防止释放锁的同时又得到锁，即让出CPU给其他线程
            try {
                Thread.sleep(5);
            }  catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
