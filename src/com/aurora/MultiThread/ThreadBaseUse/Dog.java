package com.aurora.MultiThread.ThreadBaseUse;

public class Dog extends Animal implements Runnable{
    int times = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("hi!");
            times++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (times == 10) {
                break;
            }
        }
    }
}
