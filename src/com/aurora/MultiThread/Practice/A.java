package com.aurora.MultiThread.Practice;

import java.util.Random;

public class A extends Thread {

    private boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (loop) {
            System.out.println(random.nextInt(100));

            //休眠
            try {
                Thread.sleep(1000);
            }  catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("A线程退出");
    }
}
