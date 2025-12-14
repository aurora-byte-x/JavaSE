package com.aurora.MultiThread.ThreadBaseUse;

public class SellTicket02 implements Runnable {
    // 这里不需要 static，因为我们只 new 了一个 SellTicket02 对象
    private int ticketNum = 100;

    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("售票结束...");
                break;
            }

            try {
                Thread.sleep(50);
            }  catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("窗口" + Thread.currentThread().getName() + "售出一张票, 剩余票数" + (--ticketNum));
        }
    }
}
