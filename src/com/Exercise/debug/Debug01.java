package com.Exercise.debug;

import java.util.Arrays;

public class Debug01 {
    public static void main(String[] args) {
        int[] arr = {7,1,2,3,4,6};
        int sum = 0;
        for (int i = 0; i < 5; i++){
            sum += i;
            System.out.println("i=" + i);
            System.out.println("sum=" + sum);
        }
        Arrays.sort(arr);
        System.out.println("finish1");
        System.out.println("finish2");
        System.out.println("finish3");
        System.out.println("finish4");
        System.out.println("finish5");
        System.out.println("finish6");
        System.out.println("finish7");
        System.out.println("finish8");
        System.out.println("finish9");

    }
}
