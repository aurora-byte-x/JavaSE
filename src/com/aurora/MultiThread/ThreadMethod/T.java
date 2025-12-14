package com.aurora.MultiThread.ThreadMethod;

public class T extends Thread {

    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }

            try {
                System.out.println(Thread.currentThread().getName() + "休眠中...");
                // 模拟长时间休眠 20秒
                Thread.sleep(20000);
            }  catch (InterruptedException e) {
                // 当该线程执行到一个 interrupt 方法时，就会 catch 一个异常
                // 这相当于捕获了一个中断信号，可以在这里处理中断后的业务逻辑
                System.out.println(Thread.currentThread().getName() + "被interrupt了");
            }
        }
    }
}
