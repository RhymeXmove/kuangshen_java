package com.shan.common.整数缓冲区;

public class Demo {
    public static void main(String[] args) {
        // 面试题
        Integer integer1 = new Integer(100);
        Integer integer2 = new Integer(100);
        System.out.println(integer1 == integer2); // false

        Integer integer3 =  Integer.valueOf(100);// 自动装箱
        // 相当于调用 Integer.valueOf(100);
        Integer integer4 = Integer.valueOf(100);
        System.out.println(integer3 == integer4); // true

        Integer integer5 = Integer.valueOf(200);// 自动装箱
        Integer integer6 = Integer.valueOf(200);
        System.out.println(integer5 == integer6); // false

        // 因为缓存区数组 [-128, 127] 在这之内地址一样
    }
}
