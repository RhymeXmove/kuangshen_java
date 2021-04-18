package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 使用文件字节流实现文件的复制
 */
public class Demo03 {
    public static void main(String[] args) throws Exception {
        //创建流
        FileInputStream fis = new FileInputStream("D:\\workspace\\IDEA-workspace\\kuangshen_java\\IO流\\src\\aaa.jpg");
        FileOutputStream fos = new FileOutputStream("D:\\workspace\\IDEA-workspace\\kuangshen_java\\IO流\\src\\ccc.jpg");

        ////边读边写
        byte[] b = new byte[1024];
        int count = 0;
        while ((count = fis.read(b)) != -1) {
            fos.write(b, 0, count);
        }

        //关闭
        fis.close();
        fos.close();

    }
}
