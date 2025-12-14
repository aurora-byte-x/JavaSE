package com.aurora.MultiThread.ThreadBaseUse;

public class SellTicket01 extends Thread {
    // 使用 Thread 方式，票数必须是 static 才能共享
    private static int ticketNum = 100;

    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("售票结束...");
                break;
            }

            //休眠50毫秒，模拟延迟
            try {
                Thread.sleep(50);
            }  catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("窗口" + Thread.currentThread().getName() + "售出一张票, 剩余票数" + (--ticketNum));
        }
    }
}
