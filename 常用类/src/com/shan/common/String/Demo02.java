package com.shan.common.String;

import java.util.Arrays;

public class Demo02 {
    public static void main(String[] args) {
//        已知String str = "this is a text";
//        将str中的单词单独获取
//        将str中的text替换成practice
//        在text前面插入一个easy
//        将每个单词的首字母改为大写

        String str = "this is a text";
        String[] arr = str.split(" ");
        for (String s : arr) {
            System.out.println(s);
        }


        str = str.replace("text", "practice");
        System.out.println(str);

        str =  str.replace("practice", "easy practice");
        System.out.println(str);

        for (int i = 0; i < arr.length; i++) {
            char first = arr[i].charAt(0);
            char upperfirst = Character.toUpperCase(first);
            String newstr = upperfirst + arr[i].substring(1);
            System.out.println(newstr);

        }
    }
}
