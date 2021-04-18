package com.file;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo01 {
    // 传统字节流读取
    public static void main(String[] args) throws Exception {
            // 1. 创建FileInputStream对象
            FileInputStream fis = new FileInputStream("D:\\workspace\\IDEA-workspace\\kuangshen_java\\IO流\\src\\aaa.txt");
            // 2. 读取
            int data = 0;
            while((data = fis.read()) != -1){
                System.out.print(((char)data));
            }
            // 3. 关闭
            fis.close();
    }
}
