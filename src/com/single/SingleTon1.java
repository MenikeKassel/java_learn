package com.single;
//饿汉式单例设计模式-对象已经创建好
public class SingleTon1 {
    GirlFriend gf = GirlFriend.getInstance();
    GirlFriend gf2 = GirlFriend.getInstance();
}
class GirlFriend{
    private String name;

    private static GirlFriend gf = new GirlFriend("xxx");
    //为了在静态方法中返回gf对象，使用static修饰
    private GirlFriend(String name){
        this.name = name;
    }
    public static GirlFriend getInstance(){
        return gf;
    }
}