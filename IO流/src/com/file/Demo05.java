package com.file;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * 字符缓冲流
 */
public class Demo05 {
    public static void main(String[] args) throws Exception {
        // 创建缓冲流
        FileReader fr = new FileReader("D:\\workspace\\IDEA-workspace\\kuangshen_java\\IO流\\src\\aaa.txt");
        BufferedReader br = new BufferedReader(fr);
        // 读取
        // 1. 第一种方式
        char[] buf = new char[1024];
        int count = 0;
        while((count = br.read(buf)) != -1){
            System.out.println(new String(buf, 0, count));
        }
        // 2. 第二种方式 一行一行读取
        String line = null;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }

        // 关闭
        br.close();
    }
}
