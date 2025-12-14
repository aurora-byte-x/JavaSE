package com.aurora.MultiThread.ThreadBaseUse;

public class T extends Thread{
    private int count = 0;
    //设置一个控制变量
    private boolean loop = true;

    @Override
    public void run() {
        while (loop) {
            try {
                Thread.sleep(50);
            }  catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("T运行中..." + (++count));
        }

        System.out.println("T线程运行结束");
    }

    //提供公共方法修改控制变量
    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
