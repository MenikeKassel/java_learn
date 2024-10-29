package com.Exercise;

public class InheritanceTest {
    public static void main(String[] args) {
        // 创建 com.Exercise.Animal 对象
        Animal animal = new Animal("Generic com.Exercise.Animal");
        animal.makeSound();  // 输出: Generic com.Exercise.Animal makes a sound.

        // 创建 com.Exercise.Dog 对象
        Dog dog = new Dog("Buddy");
        dog.makeSound();  // 继承父类的方法，输出: Buddy makes a sound.
        dog.bark();  // 子类特有的方法，输出: Buddy barks.
    }
}