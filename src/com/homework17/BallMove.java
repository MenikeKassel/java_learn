package com.homework17;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import java.awt.*;

public class BallMove extends JFrame {

    MyPanel mp = null;

    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }

    public BallMove() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true); // 显示窗口
        this.addKeyListener(mp); // 添加键盘监听器
    }
}

class MyPanel extends JPanel implements KeyListener {
    int x = 10; // 小球的初始 X 坐标
    int y = 10; // 小球的初始 Y 坐标
    final int ballDiameter = 100; // 小球的直径
    final int moveStep = 10; // 移动的步长

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED); // 设置小球颜色
        g.fillOval(x, y, ballDiameter, ballDiameter); // 绘制小球
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // 不适合在这里处理箭头键逻辑
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // 根据按键方向调整小球位置
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                y = Math.max(y - moveStep, 0); // 向上移动，不能超过顶部
                break;
            case KeyEvent.VK_DOWN:
                y = Math.min(y + moveStep, getHeight() - ballDiameter); // 向下移动，不能超过底部
                break;
            case KeyEvent.VK_LEFT:
                x = Math.max(x - moveStep, 0); // 向左移动，不能超过左侧
                break;
            case KeyEvent.VK_RIGHT:
                x = Math.min(x + moveStep, getWidth() - ballDiameter); // 向右移动，不能超过右侧
                break;
        }
        this.repaint(); // 重新绘制
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // 按键释放后无特殊处理
    }
}
