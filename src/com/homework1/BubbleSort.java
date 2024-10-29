package com.homework1;

import java.util.Arrays;

public class BubbleSort {
    private int[] arr;
    public BubbleSort(int[] arr){
        this.arr = arr;
    }
    public void bubblesort(){
        int temp;
        boolean swapped;
        for(int i = 0; i < arr.length; i++){
            swapped = false;
            for (int j = 0;j < arr.length-i-1; j++){
                temp = arr[j];
                if (arr[j] > arr[j+1]){
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        swapped = true;
                }else {
                    swapped =false;
                }
            }
            if(swapped == false){
                System.out.println("没有数据交换,排序已完成"+Arrays.toString(arr));
                break;

            }
        }
        System.out.println("排序已完成"+Arrays.toString(arr));
    }
}