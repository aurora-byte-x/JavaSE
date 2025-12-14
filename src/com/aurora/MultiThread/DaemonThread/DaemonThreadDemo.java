package com.aurora.MultiThread.DaemonThread;

public class DaemonThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        // 关键点：如果我们希望当 main 线程结束后，子线程自动结束
        // 只需将子线程设为守护线程即可
        // 注意：必须在 start() 之前设置，否则会抛出异常
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程");
            Thread.sleep(1000);
        }
    }
}
