package com.tank;

public class Hero extends Tank {
    Shot shot = null;
    public Hero(int x, int y) {
        super(x, y);
    }

    public void shotEnemyTank() {
        switch (getDirect()) {
            case 0: // 向上发射
                shot = new Shot(getX() + 20, getY() , 0);
                break;
            case 1: // 向右发射
                shot = new Shot(getX() + 60, getY() + 20, 1);
                break;
            case 2: // 向下发射
                shot = new Shot(getX() + 20, getY() + 60, 2);
                break;
            case 3: // 向左发射
                shot = new Shot(getX() , getY()+ 20, 3);
                break;
        }
        new Thread(shot).start();
    }
}
