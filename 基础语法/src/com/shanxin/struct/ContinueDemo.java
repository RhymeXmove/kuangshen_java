package com.shanxin.struct;

public class ContinueDemo {

    public static void main(String[] args) {
        int i = 0;
        while (i < 100) {
            i++;
            if (i == 30) {
                continue;   //跳出本次循环
            }
            System.out.print(i + "\t");



        }
    }

}
