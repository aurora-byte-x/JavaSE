package com.aurora.MultiThread.ThreadBaseUse;

public class PrintHi implements Runnable {
    int times = 0;
    @Override
    public void run() {
        while (times < 5) {
            System.out.println("hi");
            times++;
            try {
                Thread.sleep(1000);
            }  catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
