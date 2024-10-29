package com.Exercise.reader;

import com.Exercise.library.Book;
/*
在另一个包 com.Exercise.reader 中创建一个 Ebook 类，继承自 Book。请编写代码，尝试在 Ebook 类中访问 Book 的各个成员，并测试哪些可以访问
 */
public class Ebook extends Book {
    public static void main(String[] args) {
        Ebook ebook = new Ebook();
        String name = ebook.title;
        System.out.println(name);
    }
}
