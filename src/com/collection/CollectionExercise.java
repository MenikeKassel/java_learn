package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionExercise {
    public static void main(String[] args) {
        Collection arrayList = new ArrayList();
        arrayList.add(new Book("三国演义",10.7));
        arrayList.add(new Book("红楼梦",10.6));
        arrayList.add(new Book("小李飞刀",10.5));

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("obj=" + next);
        }
        List list = new ArrayList();

        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");
        list.add("666");
        list.add("777");
        list.add("888");
        list.add("999");
        list.add("000");
        System.out.println(list.toString());
        list.add(2,"234");
        list.get(5);
        list.remove(7);
        Iterator iterator1 = list.iterator();
        while (iterator1.hasNext()) {
            Object next =  iterator1.next();
            System.out.println(next);
        }

    }
}
class Book{
    String name;
    double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Book{name='" + name + "', price=" + price + "}";
    }
}