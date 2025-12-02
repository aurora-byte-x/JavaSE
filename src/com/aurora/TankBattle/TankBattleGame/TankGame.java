package com.aurora.TankBattle.TankBattleGame;

import javax.swing.*;

public class TankGame extends JFrame {

    //定义MyPanel
    MyPanel mp = null;

    public static void main(String[] args) {
        TankGame tankGame = new TankGame();
    }

    public TankGame() {
        mp = new MyPanel();
        // 把面板(就是游戏的绘图区域)放入窗口
        this.add(mp);
        this.setSize(1000, 750);

        // 核心步骤：让 JFrame 监听 mp 的键盘事件
        // 因为 mp 实现了 KeyListener 接口，所以可以作为参数传入
        this.addKeyListener(mp);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
