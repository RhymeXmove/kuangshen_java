package com.shanxin.struct;

public class ForDemo03 {
    //输出0-1000能被5整除的数，每行三个
    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {
            if (i%5==0) {
                System.out.print(i+"\t");
            }
            if (i%(5*3)==0){
                System.out.print("\n");
            }
        }
    }
}
