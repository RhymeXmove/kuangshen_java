package com.shanxin.struct;

public class TestDemo01 {
    //三角形
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j>= i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j<= i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
