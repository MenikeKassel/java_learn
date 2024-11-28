package com.tank;

import javax.swing.*;

public class TankGame extends JFrame {
    Mypanel mp = null;
    public TankGame(){
        mp = new Mypanel();

        Thread thread = new Thread(mp);
        thread.start();

        this.add(mp);
        this.setSize(1000,750);// 设置窗口的大小为 1000x750 像素
        this.addKeyListener(mp); // 添加键盘监听器
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);


    }

    public static void main(String[] args) {
        TankGame tankGame = new TankGame();

    }
}
