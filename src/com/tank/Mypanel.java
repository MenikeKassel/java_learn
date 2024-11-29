package com.tank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

//绘图区
public class Mypanel extends JPanel implements KeyListener,Runnable {
    Hero hero = null;
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTanksSize = 3;
    private List<Shot> shots = new ArrayList<>();


    public Mypanel(){
        hero = new Hero(100,100);
        hero.setSpeed(10);

        for(int i = 0; i < enemyTanksSize; i++){
            EnemyTank enemyTank = new EnemyTank((100 * (i + 1)),0);
            enemyTank.setDirect(2);
            Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() +60, enemyTank.getDirect());

            enemyTank.shots.add(shot);
            new Thread(shot).start();

            enemyTanks.add(enemyTank);

        }
        for (int i = 0; i < hero.shots.size(); i++) {
            Shot shot = hero.shots.get(i);
            if (shot != null) {

            } else {
                hero.shots.remove(shot);
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);//填充矩阵，默认黑色

        //画出坦克
        drawTank(hero.getX(),hero.getY(), g,hero.getDirect(),0);

        //画出敌方坦克
        for (int i = 0; i < enemyTanksSize; i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(),1);



        }

    }
    /**
     * 绘制坦克
     *
     * @param x      坦克的左上角x坐标
     * @param y      坦克的左上角y坐标
     * @param g      画笔对象，用于绘制坦克
     * @param direct 坦克的方向（0=上，1=右，2=下，3=左）
     * @param type   坦克的类型（1=玩家坦克，2=敌方坦克）
     */
    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        // 设置坦克颜色
        switch (type) {
            case 0:
                g.setColor(Color.GREEN);
                break;// 玩家坦克
            case 1:
                g.setColor(Color.RED);
                break;// 敌方坦克
        }

        // 根据方向绘制坦克
        switch (direct) {
            case 0: // 向上
                g.fillRect(x, y, 10, 60); // 左轮
                g.fillRect(x + 30, y, 10, 60); // 右轮
                g.fillRect(x + 10, y + 10, 20, 40); // 身体
                g.fillOval(x + 10, y + 20, 20, 20); // 圆形盖
                g.drawLine(x + 20, y + 30, x + 20, y); // 炮管
                break;
            case 1: // 向右
                g.fillRect(x, y, 60, 10); // 上轮
                g.fillRect(x, y + 30, 60, 10); // 下轮
                g.fillRect(x + 10, y + 10, 40, 20); // 身体
                g.fillOval(x + 20, y + 10, 20, 20); // 圆形盖
                g.drawLine(x + 30, y + 20, x + 60, y + 20); // 炮管
                break;
            case 2: // 向下
                g.fillRect(x, y, 10, 60); // 左轮
                g.fillRect(x + 30, y, 10, 60); // 右轮
                g.fillRect(x + 10, y + 10, 20, 40); // 身体
                g.fillOval(x + 10, y + 20, 20, 20); // 圆形盖
                g.drawLine(x + 20, y + 30, x + 20, y + 60); // 炮管
                break;
            case 3: // 向左
                g.fillRect(x, y, 60, 10); // 上轮
                g.fillRect(x, y + 30, 60, 10); // 下轮
                g.fillRect(x + 10, y + 10, 40, 20); // 身体
                g.fillOval(x + 20, y + 10, 20, 20); // 圆形盖
                g.drawLine(x + 30, y + 20, x, y + 20); // 炮管
                break;
            default:
                System.out.println("未知方向");
        }
    }

    public void drawShots(Graphics g) {

        //System.out.println("当前共有" + shots.size() +"颗子弹");
        for (Shot shot : shots) {
            g.setColor(Color.YELLOW);
            g.draw3DRect(shot.getX(), shot.getY(),10,10,false);  // 绘制子弹
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_W){
            hero.setDirect(0);
            hero.moveUp();
        }else if(e.getKeyCode() == KeyEvent.VK_D){
            hero.setDirect(1);
            hero.moveRight();
        }
        else if(e.getKeyCode() == KeyEvent.VK_S) {
            hero.setDirect(2);
            hero.moveDown();
        }
        else if(e.getKeyCode() == KeyEvent.VK_A){
            hero.setDirect(3);
            hero.moveLeft();
        }
        //让面板重绘
        this.repaint();
        if(e.getKeyCode() == KeyEvent.VK_J){
            hero.shotEnemyTank();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.repaint();
        }
    }
}
