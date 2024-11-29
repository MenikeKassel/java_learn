package com.tank;

public class Shot implements Runnable{
    private int x;
    private int y;
    private int direct;
    private int speed = 10;
    Boolean isLive = true;
    private Hero hero;

    public Shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            switch (direct){
                case 0:
                    y -= speed;
                    break;
                case 1:
                    x += speed;
                    break;
                case 2:
                    y += speed;
                    break;
                case 3:
                    x -= speed;
                    break;
            }
//            System.out.println("方向: " + direct);
//            System.out.println("x坐标：" + x + "y坐标：" + y);
            if (x < 0 || x > 1000 || y < 0 || y > 750) {
                isLive = false;
                System.out.println("子弹超出边界");
                break;  // 退出循环，子弹超出屏幕，结束线程


            }

        }
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public int getDirect() {
        return direct;
    }
}
