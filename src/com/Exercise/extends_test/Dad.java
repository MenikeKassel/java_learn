package com.Exercise.extends_test;

class Dad extends GrandPa {
    String name = "22222";
    private int age = 30;
    int n1 = 2000;
    public void test(){
        System.out.println("super.n1="+super.n1);
    }//内存中有，但是子类无法访问
}
// 我是A类
// hahah 我是B类的有参构造
// 我是c类的有参构造
// 我是c类的无参构造