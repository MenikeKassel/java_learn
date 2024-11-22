package com.homework15;

public class Car {
    private double temperature;

    // 成员内部类
    class Air {
        void flow() {
            if (Car.this.temperature > 40) {
                System.out.println("cold");
            } else if (Car.this.temperature < 0) {
                System.out.println("warm");
            } else {
                System.out.println("shut");
            }
        }
    }

    // 构造方法
    public Car(double temperature) {
        this.temperature = temperature;
    }

    // 获取Air实例的方法
    public Air getAir() {
        return new Air();
    }

    public static void main(String[] args) {
        Car car1 = new Car(45);
        Air air1 = car1.getAir(); // 使用getAir方法获取Air实例
        air1.flow();

        Car car2 = new Car(-10);
        Air air2 = car2.getAir();
        air2.flow();

        Car car3 = new Car(24);
        Air air3 = car3.getAir();
        air3.flow();
    }
}
