package com.aurora.MultiThread.ThreadMethod;

public class T3 implements Runnable{
    private int count = 0;
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            }  catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("子线程hello..." + (++count));

            if (count == 10) {
                break;
            }
        }
    }
}
