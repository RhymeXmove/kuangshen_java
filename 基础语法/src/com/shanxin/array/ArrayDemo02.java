package com.shanxin.array;


import java.util.Arrays;

public class ArrayDemo02 {
    public static void main(String[] args) {
        //Arrays类
        int[] arr = {1,2,3,6,4,9,34,22,112,32,13,42};

        //数组转string输出
        System.out.println(Arrays.toString(arr));

        //排序
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        //填充
        Arrays.fill(arr, 2, 9, 0);
        System.out.println(Arrays.toString(arr));

    }
}
