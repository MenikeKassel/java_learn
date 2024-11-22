package com.homework12;

abstract public class Animal {
    public abstract void shout();
}
class Cat extends Animal{
    @Override
    public void shout(){
        System.out.println("mmmmm");
    }
}
class Dog extends Animal{
    @Override
    public void shout(){
        System.out.println("wwwww");
    }
}