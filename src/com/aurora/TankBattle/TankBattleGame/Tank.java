package com.aurora.TankBattle.TankBattleGame;

/**
 * 坦克父类
 * 包含坐标、方向、速度和移动方法
 */
public class Tank {
    private int x;  //坦克的横坐标
    private int y;  //坦克的纵坐标
    private int direct = 0; //坦克的方向 0:上 1:右 2:下 3:左
    private int speed = 2;

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //------移动方法------
    public void moveUp() {
        y -= speed;
    }

    public void moveDown() {
        y += speed;
    }

    public void moveLeft() {
        x -= speed;
    }

    public void moveRight() {
        x += speed;
    }

    //---Getter and Setter

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
