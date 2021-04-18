package com.annotation.reflection;

public class Test05 {
    static {
        System.out.println("Main 被加载");
    }

    public static void main(String[] args) {
        // 1. 主动引用
        Son son = new Son();
        // 2. 反射也会产生主动引用
        try {
            Class.forName("com.annotation.reflection.Son");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 不会产生类的引用方法
        System.out.println(Son.b);
        Son[] array = new Son[100];
    }
}

class Father {
    static int b = 2;
    static {
        System.out.println("父类被加载");
    }
}

class Son extends Father {
    static {
        System.out.println("子类被加载");
        m = 300;
    }

    static int m = 100;
    static final int M = 1;
}