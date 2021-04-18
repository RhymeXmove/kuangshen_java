package com.io;

import jdk.nashorn.internal.ir.WhileNode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 演示 FileInputStream 使用
 * 文件字节输入流
 */
public class Demo01 {
    public static void main(String[] args) throws Exception {
        //创建fileinputstream指定文件路径
        FileInputStream fis = new FileInputStream("D:\\workspace\\IDEA-workspace\\kuangshen_java\\IO流\\src\\aaa.txt");
        //单个字节读取文件
//        int data = 0;
//        while ((data=fis.read()) != -1) {
//            System.out.print((char) data);
//        }

        //3个一次读取
//        byte[] buf = new byte[3];
//        int count = fis.read(buf);
//        System.out.println(new String(buf));
//        System.out.println(count);
//
//        int count2 = fis.read(buf);
//        System.out.println(new String(buf));
//        System.out.println(count2);

        //循环读取
        byte[] buf = new byte[1024];
        int count = 0;
        while ((count=fis.read(buf))!=-1) {
            System.out.println(new String(buf, 0, count));
        }


        //关闭
        fis.close();
        System.out.println("执行完毕");
    }
}
