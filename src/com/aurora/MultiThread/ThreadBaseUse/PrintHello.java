package com.aurora.MultiThread.ThreadBaseUse;

public class PrintHello implements Runnable {
    int times = 0;
    @Override
    public void run() {
        while (times < 10) {
            System.out.println("Hello World");
            times++;
            try {
                Thread.sleep(1000);
            }  catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
