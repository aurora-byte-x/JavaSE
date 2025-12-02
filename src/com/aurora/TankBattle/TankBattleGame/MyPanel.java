package com.aurora.TankBattle.TankBattleGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * 坦克大战的绘图区域
 * 1.继承JPanel绘图
 * 2.实现KeyListener监听键盘实践
 */
public class MyPanel extends JPanel implements KeyListener {
    //定义我方坦克
    Hero hero = null;

    //定义敌人坦克，放入Vector（线程安全）
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTankSize = 3;

    //构造器，在其中完成初始化操作
    public MyPanel() {
        //初始化自己的坦克(位置 100, 100)
        hero = new Hero(100, 100);

        //初始化敌人的坦克
        for (int i = 0; i < enemyTankSize; i++) {
            // 创建一个敌人的坦克，间隔 100 像素
            EnemyTank enemyTank = new EnemyTank(100 * (i + 1), 0);
            // 设置方向 (2 表示向下)
            enemyTank.setDirect(2);
            // 加入集合
            enemyTanks.add(enemyTank);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        //1.填充背景矩形，默认黑色
        g.fillRect(0, 0, 1000, 750);

        //2.画出自己的坦克
        drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 1);

        //3.画出敌人的坦克
        for (int i = 0; i < enemyTankSize; i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 0);
        }
    }

    /**
     *
     * @param x         坦克的左上角x坐标
     * @param y         坦克的左上角y坐标
     * @param g         画笔
     * @param direct    坦克方向（0:上 1:右 2:下 3:左）
     * @param type      坦克类型（0:敌人 1:自己）
     */
    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        // 根据不同类型的坦克，设置不同的颜色
        switch (type) {
            case 0:
                g.setColor(Color.CYAN); // 敌人的坦克 (青色)
                break;
            case 1:
                g.setColor(Color.YELLOW);   // 我的坦克 (黄色)
        }

        //根据坦克的方向，来绘制对应形状坦克
        switch (direct) {
            case 0:
                g.fill3DRect(x, y, 10, 60, false);  //左轮
                g.fill3DRect(x + 30, y, 10, 60, false); //右轮
                g.fill3DRect(x + 10, y + 10, 20, 40, false);    //舱体
                g.fillOval(x + 10, y + 20, 20, 20); //圆形盖子
                g.drawLine(x + 20, y + 30, x + 20, y);  //炮筒（向上）
                break;
            case 1: // 表示向右
                g.fill3DRect(x, y, 60, 10, false);       // 上轮
                g.fill3DRect(x, y + 30, 60, 10, false);  // 下轮
                g.fill3DRect(x + 10, y + 10, 40, 20, false); // 舱体
                g.fillOval(x + 20, y + 10, 20, 20);      // 圆形盖子
                g.drawLine(x + 30, y + 20, x + 60, y + 20); // 炮筒 (向右)
                break;
            case 2: // 表示向下
                g.fill3DRect(x, y, 10, 60, false);       // 左轮
                g.fill3DRect(x + 30, y, 10, 60, false);  // 右轮
                g.fill3DRect(x + 10, y + 10, 20, 40, false); // 舱体
                g.fillOval(x + 10, y + 20, 20, 20);      // 圆形盖子
                g.drawLine(x + 20, y + 30, x + 20, y + 60); // 炮筒 (向下)
                break;
            case 3: // 表示向左
                g.fill3DRect(x, y, 60, 10, false);       // 上轮
                g.fill3DRect(x, y + 30, 60, 10, false);  // 下轮
                g.fill3DRect(x + 10, y + 10, 40, 20, false); // 舱体
                g.fillOval(x + 20, y + 10, 20, 20);      // 圆形盖子
                g.drawLine(x + 30, y + 20, x, y + 20);   // 炮筒 (向左)
                break;
            default:
                System.out.println("暂时没有处理");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //不存在字符输入情况，不需要做处理
    }

    //处理WASD键按下的情况
    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_W) {
            // W键: 向上
            hero.setDirect(0);  //改变方向
            hero.moveUp();      //改变坐标
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            // D键: 向右
            hero.setDirect(1);
            hero.moveRight();
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            hero.setDirect(2);
            hero.moveDown();
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            hero.setDirect(3);
            hero.moveLeft();
        }

        // 3. 核心：必须重绘！如果不重绘，数据改了但屏幕不会刷新。
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //按键松开，没有对应的操作，不需要处理
    }
}
