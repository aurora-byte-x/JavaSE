package com.aurora.MultiThread.Practice;

import java.util.Scanner;

public class B extends Thread {
    private A a;
    private Scanner sc = new Scanner(System.in);

    public B(A a) {
        this.a = a;
    }
    @Override
    public void run() {

        while (true) {
            System.out.println("输入指令Q表示退出");
            char key = sc.next().toUpperCase().charAt(0);
            if (key == 'Q') {
                a.setLoop(false);
                System.out.println("B线程退出");
                break;
            }
        }
    }
}
