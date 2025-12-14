package com.aurora.MultiThread.SynchronizedDemo;

public class DeadLock extends Thread{

    // 关键点：使用 static 保证 o1, o2 是所有实例共享的，只有这样才会发生竞争
    static final Object lock1 = new Object();
    static final Object lock2 = new Object();
    boolean flag;

    public DeadLock(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        // 业务逻辑分析：
        // 1. 如果 flag 为 T (线程A)：先持有 o1 锁 -> 尝试获取 o2 锁
        // 2. 如果 flag 为 F (线程B)：先持有 o2 锁 -> 尝试获取 o1 锁
        if (flag) {
            synchronized (lock1) {  // 1. A 拿到 o1
                System.out.println(Thread.currentThread().getName() + "进入1");

                // 此时如果 B 已经拿到了 o2，A 就会在这里卡住等待 o2
                synchronized (lock2) {
                    System.out.println(Thread.currentThread().getName() + "进入2");
                }
            }

        } else {
            synchronized (lock2) {  // 1. B 拿到 o2
                System.out.println(Thread.currentThread().getName() + "进入3");

                // 此时如果 A 已经拿到了 o1，B 就会在这里卡住等待 o1
                synchronized (lock1) {
                    System.out.println(Thread.currentThread().getName() + "进入4");
                }
            }
        }
    }
}
