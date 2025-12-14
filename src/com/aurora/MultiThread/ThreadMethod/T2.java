package com.aurora.MultiThread.ThreadMethod;

public class T2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(1000);
            }  catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("子线程：hello..." + i);
        }
    }
}
