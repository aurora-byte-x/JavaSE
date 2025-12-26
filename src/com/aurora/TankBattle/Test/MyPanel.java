package com.aurora.TankBattle.Test;

import javax.swing.*;
import java.awt.*;

/**
 * 定义一个MyPanel，继承JPanel类，画图形，就在面板上画
 * 1.MyPanel就是一个画板
 * 2.Graphics g, 把 g 理解成一支画笔
 * 3.Graphics提供了很多绘图的方法
 */
public class MyPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);     //调用父类的方法完成初始化
        System.out.println("paint方法被调用了");

        //画出一个圆形
        g.drawOval(10, 10, 100, 100);

        //画直线
        g.drawLine(150, 10, 200, 100);

        //画矩形边框
        g.drawRect(300, 10, 100, 100);

        //画椭圆边框
        g.drawOval(450, 10, 60, 100);

        //画填充矩形
        g.fillRect(600, 10, 60, 100);

        //设置画笔的颜色
        g.setColor(Color.blue);
        g.fillRect(750, 10, 60, 100);

        //红色填充椭圆
        g.setColor(Color.red);
        g.fillOval(10, 150, 100, 60);

        //画图片
        Image image = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/img/source/shot.jpg"));
        g.drawImage(image, 150, 150, 300, 300, this);

        //画字符串
        g.drawString("hello", 500, 200);

        //设置颜色字体后画字符串
        g.setColor(Color.red);
        g.setFont(new Font("隶书", Font.BOLD, 50));
        g.drawString("hello", 650, 200);

        g.fill3DRect(500, 500, 30, 40, false);

    }
}
