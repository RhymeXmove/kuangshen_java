package com.shanxin.struct;

public class GotoDemo {
    //0-150之间的质数
    public static void main(String[] args) {
        int count = 0;
        outer:for (int i = 0; i <= 150; i++) {
            //一个数只可能被小于自己一半的数整除；
            for (int j =2; j<i/2; j++) {
                if (i%j==0) {
                    continue outer;
                }
            }
            System.out.print(i + "\t");
        }
    }
}
