package com.file;

import java.io.FileReader;

public class Demo02 {
    public static void main(String[] args) throws Exception {
        // 1. 创建FileReader 文件字符输入流
        FileReader fr = new FileReader("D:\\workspace\\IDEA-workspace\\kuangshen_java\\IO流\\src\\aaa.txt");
        // 2. 读取
        // 2.1 单个字符读取
        int data = 0;
        while((data = fr.read()) != -1){
            System.out.print((char)data);// 读取一个字符
        }

        char[] buf = new char[2];// 字符缓冲区读取
        int count = 0;
        while((count = fr.read(buf)) != -1){
            System.out.print(new String(buf, 0, count));
        }

        // 3. 关闭
        fr.close();
    }
}
