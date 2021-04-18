package com.file;

import java.io.FileReader;
import java.io.FileWriter;

public class Demo04 {
    public static void main(String[] args) throws Exception{
        // 1. 创建
        FileReader fr = new FileReader("D:\\workspace\\IDEA-workspace\\kuangshen_java\\IO流\\src\\aaa.txt");
        FileWriter fw = new FileWriter("D:\\workspace\\IDEA-workspace\\kuangshen_java\\IO流\\src\\fff.txt");
        // 2. 读写
        int data = 0;
        while((data = fr.read()) != -1){
            fw.write(data);
            fw.flush();
        }
        // 3. 关闭
        fw.close();
        fr.close();
    }
}
