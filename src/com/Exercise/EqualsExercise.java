package com.Exercise;

import java.sql.SQLOutput;

public class EqualsExercise {

    public static void main(String[] args) {
        Person person1 = new Person("jack", 23, '男');
        Person person2 = new Person("jack", 23, '男');
        System.out.println(person1.equals(person2));

    }
}

class Person{
    private String name;
    private int age;
    private char gender;

    @Override
    public boolean equals(Object object){
        if (this == object){
            return true;
        }
        if (object instanceof Person){
            Person p = (Person)object;// 取得object的属性
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }
        return false;


    }
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

}
