package com.wapper;

public class Integer01 {
    public static void main(String[] args) {
        int n1 = 100;


        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);

        //手动拆箱
        //Integer -- int
        int i1 = integer1.intValue();


        //jdk5后，就可以自动装箱和自动拆箱
        int n2 = 100;
        Integer integer2 = n2;

        int n3 = integer2;//integer1.intValue();
        Object object = true ? new Integer(1):new Double(2.0);
        System.out.println(object);

        //包装类 -- String
        Integer i = 100;
        //方式1
        String s1 = i + "";//i没有变化
        //方式2
        String s2 = i.toString();
        //方式3
        String s3 = String.valueOf(i);

        String num = "12345";
        //method 1
        Integer.parseInt(num);

        Integer i2 = new Integer(num);//构造器


        Integer m1 = new Integer(1);
        Integer m2 = new Integer(1);
        System.out.println(m1 == m2);

        Integer m3 = 12;
        Integer m4 = 12;
        System.out.println(m3 == m4);

    }
}
