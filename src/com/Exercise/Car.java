package com.Exercise;

public class Car {
    // 成员变量（属性）
    String model;
    int speed;

    // 成员方法（行为）
    public void accelerate() {
        speed += 10;
        System.out.println("The car is accelerating. Current speed: " + speed);
    }

    public void stop() {
        speed = 0;
        System.out.println("The car has stopped.");
    }

    public static void main(String[] args) {
        // 创建Car类的对象
        Car myCar = new Car();

        // 给成员变量赋值
        myCar.model = "Toyota";
        myCar.speed = 50;

        // 调用成员方法
        myCar.accelerate();  // 输出：The car is accelerating. Current speed: 60
        myCar.stop();        // 输出：The car has stopped.
    }
}
