package com.shanxin.struct;

public class DoWhileDemo01 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        do{
            i++;
            System.out.println("i = " + i);
            sum+=i;
            System.out.println("sum = " + sum);
        }while (i < 100);

        System.out.println(sum);
    }
}
