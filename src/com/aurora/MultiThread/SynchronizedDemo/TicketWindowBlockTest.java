package com.aurora.MultiThread.SynchronizedDemo;

public class TicketWindowBlockTest {
    public static void main(String[] args) {
        TicketWindowBlock ticketWindowBlock = new TicketWindowBlock();
        Thread t1 = new Thread(ticketWindowBlock);
        Thread t2 = new Thread(ticketWindowBlock);
        Thread t3 = new Thread(ticketWindowBlock);

        t1.start();
        t2.start();
        t3.start();
    }
}
