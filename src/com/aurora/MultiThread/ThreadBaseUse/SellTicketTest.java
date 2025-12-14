package com.aurora.MultiThread.ThreadBaseUse;

public class SellTicketTest {
    public static void main(String[] args) {
        System.out.println("=========继承Thread方式========");
        SellTicket01 sellTicket01_1 = new SellTicket01();
        SellTicket01 sellTicket01_2 = new SellTicket01();
        SellTicket01 sellTicket01_3 = new SellTicket01();

        sellTicket01_1.start();
        sellTicket01_2.start();
        sellTicket01_3.start();

        // 启动三个线程，代理同一个 Runnable 对象
//        System.out.println("========实现Runnable接口方式========");
//        SellTicket02 sellTicket02 = new SellTicket02();
//        new Thread(sellTicket02).start();
//        new Thread(sellTicket02).start();
//        new Thread(sellTicket02).start();
    }
}
