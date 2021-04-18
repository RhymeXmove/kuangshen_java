package com.file;

import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * 桥转换流
 */
public class Demo08 {
    public static void main(String[] args) throws Exception {
        // 1 创建InputStreamReader对象
        FileInputStream fis = new FileInputStream("D:\\workspace\\IDEA-workspace\\kuangshen_java\\IO流\\src\\fff.txt");
        InputStreamReader isr = new InputStreamReader(fis, "utf-8");
        // 2 读取文件
        int data = 0;
        while((data = isr.read()) != -1){
            System.out.print((char)data);
        }
        // 3 关闭
        isr.close();
    }
}
