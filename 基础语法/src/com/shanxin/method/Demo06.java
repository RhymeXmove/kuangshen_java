package com.shanxin.method;

public class Demo06 {
    //递归，自己调用自己,必须有一个边界条件
    //阶乘
    public static void main(String[] args) {
        System.out.println(fun(4));
    }

    public static int fun(int n) {
        //n==1就是边界条件，f(1)
        if (n==1){
            return 1;
        }else {
            return n*fun(n-1);
        }
    }

}
