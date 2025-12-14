package com.aurora.MultiThread.SynchronizedDemo;

public class DeadLockTest {
    public static void main(String[] args) {
        DeadLock A = new DeadLock(true);
        A.setName("线程A");
        DeadLock B = new DeadLock(false);
        B.setName("线程B");

        A.start();
        B.start();
    }
}
