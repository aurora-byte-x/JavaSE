package com.aurora.MultiThread.ThreadMethod;

public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        T2 t = new T2();
        t.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("主线程:hi..." + i);
            Thread.sleep(1000);

            if (i == 5) {
                // --- 关键代码 ---

                // 方式 1: join (插队/等待)
//                 t.join();
                // 效果：main 线程阻塞，直到 t2 执行完毕，main 才会继续执行第 6 次。
                // 符合题目"让子线程运行完毕"的要求。

                // 方式 2: yield (礼让)
                Thread.yield();
                // 效果：main 线程暂停一下，让出 CPU。
                // 但如果 CPU 资源不紧张，main 可能立刻又抢到了资源，礼让不一定成功。
            }
        }
    }
}
