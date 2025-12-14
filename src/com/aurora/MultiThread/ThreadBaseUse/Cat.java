package com.aurora.MultiThread.ThreadBaseUse;

public class Cat extends Thread{
    int times = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("喵喵，我是小猫咪" + (++times) + "线程名=" + Thread.currentThread().getName());
            //让线程休眠1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (times == 80) {
                break;
            }
        }

    }
}
