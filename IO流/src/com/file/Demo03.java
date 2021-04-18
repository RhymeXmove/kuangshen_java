package com.file;

import java.io.FileWriter;

public class Demo03 {
    public static void main(String[] args) throws Exception {
        // 1. 创建FileWriter对象
        FileWriter fw = new FileWriter("D:\\workspace\\IDEA-workspace\\kuangshen_java\\IO流\\src\\aaa.txt");
        // 2. 写入
        for(int i = 0; i < 10; i ++){
            fw.write("写入的内容");
            fw.flush();
        }
        // 3. 关闭
        fw.close();
        System.out.println("执行完毕");
    }
}
