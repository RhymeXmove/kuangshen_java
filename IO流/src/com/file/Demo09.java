package com.file;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 *
 */
public class Demo09 {
    public static void main(String[] args) throws Exception {

        // 1 创建OutputStreamReader对象
        FileOutputStream fos = new FileOutputStream("D:\\workspace\\IDEA-workspace\\kuangshen_java\\IO流\\src\\fff.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
        // 2 写入
        for (int i = 0; i < 10; i++) {
            osw.write("写入内容\n");
            osw.flush();
        }
        // 3 关闭
        osw.close();

    }
}
