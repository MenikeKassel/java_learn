package com.single;
//饿汉式单例设计模式-对象已经创建好
public class SingleTon2 {
    GirlFriend gf = GirlFriend.getInstance();
    GirlFriend gf2 = GirlFriend.getInstance();
}
class Cat{
    private String name;

    private static Cat cat ;//默认是null
    //为了在静态方法中返回gf对象，使用static修饰
    private Cat(String name){
        this.name = name;
    }
    public static Cat getInstance(){
        if (cat == null){
            cat = new Cat("xxx");
        }
        return cat;
    }
}