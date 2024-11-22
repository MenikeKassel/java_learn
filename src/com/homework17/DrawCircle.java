package com.homework17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@SuppressWarnings({"all"})
public class DrawCircle extends JFrame{
    private MyPanel mp = null;


    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400,300);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
//class MyPanel extends JPanel implements KeyListener {
//    @Override
//    public void paint(Graphics g) {
//        super.paint(g);
//        g.drawOval(10,10,100,100);
//    }
//
//    @Override
//    public void keyTyped(KeyEvent e) {
//        System.out.println((char)e.getKeyCode()+"被按下");
//        if(e.getKeyCode() == KeyEvent.VK_DOWN){
//
//        }
//    }
//
//    @Override
//    public void keyPressed(KeyEvent e) {
//
//    }
//
//    @Override
//    public void keyReleased(KeyEvent e) {
//
//    }
//}