package com.shanxin.struct;

public class ForDemo02 {
    public static void main(String[] args) {
//        0~100之间奇数和偶数的和

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i <= 100; i++) {
            if (i%2!=0){
                oddSum+=i;
            }else {
                evenSum+=i;
            }
        }
        System.out.println("奇数的合为:" + oddSum + "\n" + "偶数的合为:" + evenSum);
    }

}
