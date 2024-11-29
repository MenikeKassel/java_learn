package com.tank;

import java.util.Random;
import java.util.Vector;

public class EnemyTank extends Tank {
    private Random random = new Random();
    private Shot shot = null;
    private int step = 10;  // Movement step, change this based on your desired speed
    Vector<Shot> shots = new Vector<>();

    public EnemyTank(int x, int y) {
        super(x, y);
    }

}
