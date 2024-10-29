package com.homework3;

public class Professor extends Teacher {
    public Professor(String name, int age, double salary) {
        super(name, age, "教授", salary * 1.3);  // 教授工资系数为 1.3
    }

    // 重写 introduce 方法
    @Override
    public void introduce() {
        System.out.println("com.homework3.Professor Info:");
        super.introduce();
    }
    public void article(){
        System.out.println("写论文");
    }
}
