package com.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 缓冲流读文件 BufferedInputStream
 */
public class Demo04 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("D:\\workspace\\IDEA-workspace\\kuangshen_java\\IO流\\src\\aaa.txt");
        //创建缓冲流对象
        BufferedInputStream bis = new BufferedInputStream(fis);
        //读取
//        int data = 0;
//        while ((data=bis.read())!=-1){
//            System.out.print((char) data);
//        }
        byte[] buf = new byte[1024];
        int count = 0;
        while ((count = bis.read(buf))!=-1) {
            System.out.print(new String(buf, 0, count));
        }

        //关闭
        bis.close();
    }
}
