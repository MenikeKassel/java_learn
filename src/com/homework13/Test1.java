package com.homework13;

public class Test1 {

}
class A{
    private String name = "aaa";
    public void f1(){
        class B{
            private String name = "ddd";
            void show(){
                System.out.println(name);
                System.out.println(A.this.name);
            }
        }
        B b = new B();  // 在 f1 方法中实例化局部内部类 B
        b.show();       // 调用 show 方法

    }


    public static void main(String[] args) {
        A a = new A();
        a.f1();

    }
}