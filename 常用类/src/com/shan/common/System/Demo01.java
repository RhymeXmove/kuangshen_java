package com.shan.common.System;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) {
        // arrcopy 数组的复制
        // src: 源数组
        // srcPos: 从哪个位置开始复制 0
        // dest: 目标数组
        // destPos: 目标数组的位置
        // length: 复制的长度
        int[] arr = {20, 10, 15, 8, 35, 26, 45, 90};
        int[] targetarr = new int[8];

        System.arraycopy(arr, 4, targetarr, 6,2);
        System.out.println(Arrays.toString(targetarr));

        //Arrays.copyOf()底层源码实现方式依旧为arraycopy
        int[] targetarr2 = Arrays.copyOf(arr,6);
        System.out.println(Arrays.toString(targetarr2));

        //退出JVM,下面的代码不再执行
        System.exit(0);
        System.out.println("程序结束了···········");
    }
}
