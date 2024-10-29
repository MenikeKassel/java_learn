package com.homework6;


public class Son extends Grand {
    String id = "002";  // Son 类的独有属性
    String name = "BB"; // Son 类的 name 属性，会覆盖从 Grand 类继承的 name

    public void s1() {
        // 访问父类的成员
        System.out.println("Name (from Grand): " + super.name);  // 使用 super 访问父类的 name 属性
        super.g1();  // 使用 super 调用父类的 g1() 方法
        // super.age;  // 无法访问父类的 age 属性，因为它是 private

        // 访问自身的成员
        System.out.println("ID (from Son): " + this.id); // 使用 this 访问自身的 id 属性
        System.out.println("Name (from Son): " + this.name); // 使用 this 访问自身的 name 属性
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.s1();
    }
}
