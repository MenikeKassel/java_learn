package com.homework7;

class Demo extends Test {  // 子类
    String name = "Jack";  // 子类的 name 属性

    Demo() {  // 子类的无参构造方法
        super();  // 调用父类的无参构造方法
        System.out.println("Demo");
    }

    Demo(String name) {  // 子类的带参构造方法
        super(name);  // 调用父类的带参构造方法
    }

    public void test() {
        System.out.println("Super name: " + super.name);  // 调用父类的 name
        System.out.println("This name: " + this.name);  // 调用子类的 name
    }

    public static void main(String[] args) {
        new Demo().test();  // 匿名对象调用无参构造方法和 test 方法
        new Demo("John").test();  // 匿名对象调用带参构造方法和 test 方法
    }
}
