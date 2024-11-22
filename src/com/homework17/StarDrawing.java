package com.homework17;

import javax.swing.*;
import java.awt.*;

public class StarDrawing extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // 设置抗锯齿，让线条更平滑
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // 五角星的中心坐标和半径
        int centerX = 200;
        int centerY = 200;
        int radius = 100;

        // 计算五角星的顶点坐标
        int[] xPoints = new int[10];
        int[] yPoints = new int[10];
        for (int i = 0; i < 10; i++) {
            double angle = Math.toRadians(90 + i * 36); // 每个点的角度
            int r = (i % 2 == 0) ? radius : radius / 2; // 外圈和内圈的交替半径
            xPoints[i] = centerX + (int) (Math.cos(angle) * r);
            yPoints[i] = centerY - (int) (Math.sin(angle) * r);
        }

        // 绘制五角星
        g2d.setColor(Color.BLUE);
        g2d.fillPolygon(xPoints, yPoints, 10); // 填充五角星

        g2d.setColor(Color.BLACK);
        g2d.drawPolygon(xPoints, yPoints, 10); // 描边五角星
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("绘制五角星");
        StarDrawing panel = new StarDrawing();

        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
