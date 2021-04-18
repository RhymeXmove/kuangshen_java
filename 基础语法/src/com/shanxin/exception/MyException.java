package com.shanxin.exception;

//自定义的异常
public class MyException extends Exception {
    private int detail;

    public MyException(int a){
        this.detail = a;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "传递参数=" + detail +
                '}';
    }
}
