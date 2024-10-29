package com.Exercise;

// 父类 com.Exercise.Animal
class Animal {
    // 父类的成员变量
    protected String name;

    // 父类的构造器
    public Animal(String name) {
        this.name = name;
    }

    // 父类的方法
    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}

// 子类 com.Exercise.Dog 继承父类 com.Exercise.Animal
class Dog extends Animal {
    // 子类的构造器
    public Dog(String name) {
        super(name);  // 调用父类的构造器
    }
    //@Override
    public void makeSound(){
        //super.makeSound();
        System.out.println("dog barks");
    }
    // 子类特有的方法
    public void bark() {
        System.out.println(name + " barks.");
    }
}

