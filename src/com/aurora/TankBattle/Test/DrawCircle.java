package com.aurora.TankBattle.Test;

import javax.swing.*;

public class DrawCircle extends JFrame {

    //定义一个面板
    private MyPanel mp = null;
    

    public DrawCircle() {   //构造器
        //初始化面板
        mp = new MyPanel();
        //把面板放到窗口里
        this.add(mp);
        //设置窗口的大小
        this.setSize(1000, 800);
        //当点击窗口的小×时，程序完全退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);  //可以显示
    }

}
