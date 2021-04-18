package com.shanxin.array;

import java.util.Arrays;

//冒泡排序
public class ArrayDemo {
    public static void main(String[] args) {
        bubble(4,5,6,1,41,7,21,6);
    }

    public static void bubble(int... arr) {
        int temp = 0;

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j+1]>arr[j]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
