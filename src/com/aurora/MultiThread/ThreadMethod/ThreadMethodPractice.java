package com.aurora.MultiThread.ThreadMethod;

public class ThreadMethodPractice {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new T3());

        for (int i = 1; i <= 10; i++) {
            System.out.println("主线程hi..." + i);
            Thread.sleep(1000);

            if (i == 5) {
                t.start();
                t.join();
            }
        }
    }
}
