package com.shanxin.exception;

public class Test {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        //捕获多个异常，需要从大到小
        try {
            System.out.println(a/b);
        }
        catch (Exception e){
            System.out.println("Exception");
        }catch (Throwable t) {
            System.out.println("Throwable");
        } finally {
            System.out.println("finally");
        }
    }

    public void a(){ b();}
    public void b(){ a();}

}
