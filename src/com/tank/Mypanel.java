package com.tank;

import javax.swing.*;
import java.awt.*;

//绘图区
public class Mypanel extends JPanel {
    Hero hero = null;
    public Mypanel(){
        hero = new Hero(100,100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,100,750);

    }
}
