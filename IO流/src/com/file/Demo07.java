package com.file;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * PrintWriter
 */
public class Demo07 {
    public static void main(String[] args) throws FileNotFoundException {
        // 1 创建打印流
        PrintWriter pw = new PrintWriter("D:\\workspace\\IDEA-workspace\\kuangshen_java\\IO流\\src\\fff.txt");
        // 2 打印
        pw.println(12);
        pw.println(true);
        pw.println(3.14);
        pw.println('a');
        // 3 关闭
        pw.close();
    }
}
