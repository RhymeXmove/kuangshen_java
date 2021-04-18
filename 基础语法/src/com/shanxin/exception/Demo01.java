package com.shanxin.exception;

public class Demo01 {
    public static void main(String[] args) {

        new Demo01().test1(1,0);
        new Demo01().test2(1,0);
        new Demo01().test2(1,1);
        new Demo01().test3(1,0);
        new Demo01().test3(1,1);
    }

    public void test1(int a, int b){
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("test1,finally");
        }
    }

    public void test2(int a, int b) throws ArithmeticException {
        System.out.println("test2:" + a/b);
    }

    public void test3(int a, int b){
        if(b==0){
            throw new ArithmeticException();
        }else{
            System.out.println("test3:" + a/b);
        }
    }
}
