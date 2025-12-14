package com.aurora.MultiThread.Practice;

public class DrawMoney implements Runnable {
    private int money = 10000;
    private final Object lock = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (money > 0) {
                    money -= 1000;
                    System.out.println(Thread.currentThread().getName() + "取出了1000元，余额：" + money);

                    try {
                        Thread.sleep(100);
                    }  catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("钱被取完了");
                    break;
                }
            }
        }
    }
}
