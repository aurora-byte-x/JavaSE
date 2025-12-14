package com.aurora.MultiThread.Practice;

public class Practice02 {
    public static void main(String[] args) {
        DrawMoney drawMoney = new DrawMoney();
        Thread t1 = new Thread(drawMoney);
        t1.setName("t1");
        Thread t2 = new Thread(drawMoney);
        t2.setName("t2");

        t1.start();
        t2.start();
    }
}
