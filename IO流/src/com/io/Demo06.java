package com.io;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
/**
 * 序列化
 */
public class Demo06 {
    public static void main(String[] args) throws Exception {
        // 1. 创建对象流
        FileOutputStream fos = new 	FileOutputStream("D:\\workspace\\IDEA-workspace\\kuangshen_java\\IO流\\src\\st.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        // 2. 序列化（写入操作）
        Student zhangsan = new Student("zs", 20);
        oos.writeObject(zhangsan);
        // 3. 关闭
        oos.close();
    }
}
