package com.homework7;

class Test {  // 父类
    String name = "Rose";  // 父类的 name 属性

    public Test() {  // 父类的无参构造方法
        System.out.println("Test");
    }

    public Test(String name) {  // 父类的带参构造方法
        this.name = name;
    }
}

