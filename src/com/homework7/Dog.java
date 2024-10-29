package com.homework7;

class Dog extends Animal {
    String type = "Dog";

    Dog() {
        super();  // 调用父类的无参构造方法
        System.out.println("Dog Constructor");
    }

    Dog(String type) {
        super(type);  // 调用父类的带参构造方法
    }
    @Override
    public String getType() {
        return type;
    }
    public void displayType() {
        System.out.println("Animal Type: " + super.type);
        System.out.println("Dog Type: " + this.type);
    }

    public static void main(String[] args) {
        new Dog().displayType();          // 匿名对象，调用无参构造和 displayType 方法
        new Dog("Bulldog").displayType(); // 匿名对象，调用带参构造和 displayType 方法

        Animal animal = new Dog();  // 父类引用指向子类对象
        System.out.println("Type (attribute): " + animal.type);  // 访问属性
        System.out.println("Type (method): " + animal.getType());  // 调用方法

        Dog dog = new Dog();
        System.out.println("Type (attribute): " + dog.type);  // 访问属性
        System.out.println("Type (method): " + dog.getType());  // 调用方法
    }
}
//Animal Constructor
//"Dog Constructor"
//Animal Type: Unknown Animal
// Dog Type: Dog
//Animal Type: Bulldog
// Dog Type: Dog
