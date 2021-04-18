package com.shanxin.struct;

public class WhileDemo03 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (i<100) {
            i++;
            System.out.println("i = " + i);
            sum+=i;
            System.out.println("sum = " + sum);
        }
        System.out.println(sum);
    }
}
