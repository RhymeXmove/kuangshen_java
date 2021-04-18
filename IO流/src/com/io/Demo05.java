package com.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 *缓冲流写文件 BufferedOutputStream
 */
public class Demo05 {
    public static void main(String[] args) throws Exception {
        //创建缓冲流对象
        FileOutputStream fos = new FileOutputStream("D:\\workspace\\IDEA-workspace\\kuangshen_java\\IO流\\src\\ddd.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        //写入文件
        for (int i = 0; i < 5; i++) {
            bos.write("theworllllld\n".getBytes()); //写入缓冲区,缓冲区默认大小为8k
            bos.flush(); // 刷新到硬盘
        }

        //关闭,bos.close();会自动调用 bos.flush(), 但异常中断的话会写入失败
        bos.close();
    }
}
