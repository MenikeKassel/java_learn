package com.homework18;


public class CpuNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int run = runtime.availableProcessors();
        System.out.println(run);

    }
}
