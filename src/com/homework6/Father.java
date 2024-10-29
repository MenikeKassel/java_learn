package com.homework6;

public class Father extends Grand{
    String id = "001";
    private double score;
    public void f1(){
        System.out.println("Accessing superclass attribute 'name': " + super.name);  // 访问父类的非私有属性
        super.g1();  // 调用父类的 g1 方法
        System.out.println("Accessing 'id' attribute of Father: " + this.id);
        System.out.println("Accessing 'score' attribute of Father: " + this.score);
        System.out.println("Accessing 'score' attribute of Father: " + this.name);

    }
}
