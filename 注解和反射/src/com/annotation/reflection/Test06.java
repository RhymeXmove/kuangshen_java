package com.annotation.reflection;

public class Test06 {
    public static void main(String[] args) {
        //获取系统类的加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        //获取系统类加载器的父类加载器 --> 扩展类加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);

        //获取扩展类加载器的父类加载器 --> 根加载器（C/c++）
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);

        //测试当前类是哪个加载器加载的
        ClassLoader classLoader = null;
        try {
            classLoader = Class.forName("com.annotation.reflection.Test06").getClassLoader();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(classLoader);

        //测试JDK内置的类是谁加载的
        try {
            classLoader = Class.forName("java.lang.Object").getClassLoader();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(classLoader);
    }
}
