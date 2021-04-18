package com.file;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Demo06 {
    public static void main(String[] args) throws Exception {
        // 1. 创建BufferedWriter对象
        FileWriter fw = new FileWriter("D:\\workspace\\IDEA-workspace\\kuangshen_java\\IO流\\src\\fff.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        // 2. 写入
        for(int i = 0; i < 10; i ++){
            bw.write("写入的内容");
            bw.newLine(); // 写入一个换行符,linux和windows都能用,\n只有windows能用,换行用newLine()增加兼容性
            bw.flush();
        }
        // 3. 关闭
        bw.close(); // 此时会自动关闭fw
    }
}
