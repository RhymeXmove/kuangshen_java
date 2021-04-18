package com.io;

import java.io.FileOutputStream;

/**
 * 输出流
 * FileOutputStream
 */
public class Demo02 {
    public static void main(String[] args) throws Exception {
        //创建文件输出流对象;
        FileOutputStream fos = new FileOutputStream("D:\\workspace\\IDEA-workspace\\kuangshen_java\\IO流\\src\\bbb.txt");
        //写入文件
        fos.write(97);
        fos.write('b');
        fos.write('c');

        //写入字符串
        String str = "helloworld";
        fos.write(str.getBytes());

        fos.close();
        System.out.println("执行完毕");

    }
}
