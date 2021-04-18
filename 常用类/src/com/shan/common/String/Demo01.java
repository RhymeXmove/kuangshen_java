package com.shan.common.String;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Demo01 {
    public static void main(String[] args) {

        // 1. length(); 返回字符串长度
        // 2. charAt(int index); 返回某个位置的字符
        // 3. contains(String str); 判断是否包含某个字符串

        String content = "java是最好的语言, java no1";
        System.out.println(content.length()); // 10
        System.out.println(content.charAt(content.length() - 1)); // 言
        System.out.println(content.contains("java")); // true

        // 4. toCharArray(); 返回字符串对应数组
        // 5. indexOf(); 返回子字符串首次出现的位置
        // 6. lastIndexOf(); 返回字符串最后一次出现的位置

        System.out.println(content.toCharArray());
        System.out.println(content.indexOf("java")); // 0
        System.out.println(content.indexOf("java", 4)); // 从索引4开始找 返回12
        System.out.println(content.lastIndexOf("java")); // 12

        // 7. trim(); //去掉字符串前后空格
        // 8. toUpperCase(); toLowerCase(); 转换大小写
        // 9. endWith(str); startWith(str);  判断是否以str 结尾、开头

        String ct = " hello world ";
        System.out.println(ct.trim()); // "hello world"
        System.out.println(ct.toUpperCase()); // HELLO WORLD
        System.out.println(ct.toLowerCase()); // hello world
        System.out.println(ct.endsWith("world")); // true
        System.out.println(ct.startsWith("hello")); // true

        // 10. replace(char old, char new); 用心的字符或字符串替换旧的字符或字符串
        // 11. split(); 对字符串拆分

        System.out.println(content.replace("java", "python")); // php是最好的语言, php no1

        String say = "java is the best language";
        String[] arr = say.split(" "); // "[ ,]+" 表示空格 逗号切分 +号表示切分可以多个 比如多个空格
        System.out.println(arr.length); // 5
        for (String string : arr) {
            System.out.println(string);
        }
        // 打印出
        //java
        //is
        //the
        //best
        //language

        // 补充两个equals/compareTo();比较大小
        String s1 = "hello";
        String s2 = "HELLO";
        System.out.println(s1.equalsIgnoreCase(s2));// 忽略大小写比较true

        // compareTo(); 两字符不同时比较字符字典序的ascii码
        // 字符相同时比较长度 返回差值


    }
}
