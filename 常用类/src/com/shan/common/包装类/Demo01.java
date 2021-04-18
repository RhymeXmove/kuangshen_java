package com.shan.common.包装类;

public class Demo01 {
    public static void main(String[] args) {
        // 装箱， 基本类型 → 引用类型
        // 基本类型
        int num1 = 18;
        // 使用Integer类创建对象
        Integer integer1 = new Integer(num1);
        Integer integer2 = Integer.valueOf(num1);

        System.out.println("装箱");
        System.out.println(integer1);
        System.out.println(integer2);

        // 拆箱， 引用类型 → 基本类型
        Integer integer3 = new Integer(100);
        int num2 = integer3.intValue();

        System.out.println("拆箱");
        System.out.println(num2);

        //↑ JDK1.5 之前，JDK1.5之后自动装箱和拆箱
        int age = 30;
        //自动装箱
        Integer integer4 = age;
        System.out.println("自动装箱");
        System.out.println(integer4);
        //自动拆箱
        int age2 = integer4;

        System.out.println("自动拆箱");
        System.out.println(age2);


        System.out.println("------------------基本类型和字符串之间的转换---------------------");
        //基本类型和字符串之间的转换
        //基本类型转换为字符串
        // 基本类型和字符串之间转换
        // 1. 基本类型转成字符串
        int n1 = 100;
        // 1.1 使用+号
        String s1 = n1 + "";
        // 1.2 使用Integer中的toString()方法
        String s2 = Integer.toString(n1,2);
        System.out.println(s2);
       //String s2 = Integer.toString(n1, x); // x为进制要求

        // 2. 字符串转成基本类型
        String str = "150";
        // 使用Integer.parseXXX();
        int n2 = Integer.parseInt(str);
        System.out.println(n2);

        // boolean 字符串形式转成基本类型，"true" ---> true 非“true ———> false
        String str2 = "true";
        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1);
    }
}
