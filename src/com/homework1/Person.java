package com.homework1;

public class Person {
    String name;
    int age;
    String job;
    public Person setName(String name) {
        this.name = name;
        return this;  // 返回当前对象
    }

    public Person setAge(int age) {
        this.age = age;
        return this;  // 返回当前对象
    }

    public Person setJob(String job) {
        this.job = job;
        return this;
    }

    public void printPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // 方法链调用
        Person person1 = new Person().setName("Alice").setAge(25);
        Person person2 = new Person().setName("Bob").setAge(21);
        Person person3 = new Person().setName("Cat").setAge(23);
        int[] arr = {person1.age,person2.age,person3.age};
        BubbleSort bubbleSort = new BubbleSort(arr);
        bubbleSort.bubblesort();

    }
}
