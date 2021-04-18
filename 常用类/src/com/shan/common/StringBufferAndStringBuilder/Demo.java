package com.shan.common.StringBufferAndStringBuilder;

public class Demo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("java世界第一");
        System.out.println(sb.toString());
        sb.append("java真香");
        System.out.println(sb.toString());
        sb.append("java不错");
        System.out.println(sb.toString());
        sb.insert(0,"我在最前面");
        System.out.println(sb.toString());
        sb.replace(0,5,"hello");
        System.out.println(sb.toString());
        sb.delete(0,5);
        System.out.println(sb.toString());
        sb.delete(0,sb.length());
        System.out.println("delete" + sb.toString());
    }
}
