package com.aurora.MultiThread.DaemonThread;

public class MyDaemonThread extends Thread{
    @Override
    public void run() {
        while (true){   // 无限循环
            try {
                Thread.sleep(1000);
            }  catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("守护线程");
        }
    }
}
