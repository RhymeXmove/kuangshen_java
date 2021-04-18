package com.shanxin.struct;

public class DoWhileDemo02 {
    public static void main(String[] args) {
        int a = 0;
        while (a<0) {
//            未执行
            a++;
            System.out.println(a);
        }
        System.out.println("=============================");
        do {
//           先执行do，再while
            System.out.println(a);
            a++;
        }while (a<0);
    }
}
