package com.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * 反序列化
 */
public class Demo07 {
    public static void main(String[] args) throws Exception {
        // 1. 创建对象流
        FileInputStream fis = new FileInputStream("D:\\workspace\\IDEA-workspace\\kuangshen_java\\IO流\\src\\st.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        // 2. 读取文件（反序列化）
        Student s = (Student)ois.readObject();
        // 3. 关闭
        ois.close();
        System.out.println(s.toString());
    }
}
