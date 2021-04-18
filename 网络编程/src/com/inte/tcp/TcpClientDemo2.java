package com.inte.tcp;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
//客户端提交文件
public class TcpClientDemo2 {
    public static void main(String[] args) {
        Socket socket = null;
        OutputStream os = null;
        FileInputStream fis = null;
        try {
            //创建一个socket连接
            socket = new Socket(InetAddress.getByName("127.0.0.1"), 9000);
            //创建一个输出流
            os = socket.getOutputStream();
            //读取文件
            fis = new FileInputStream(new File("D:\\workspace\\IDEA-workspace\\kuangshen_java\\网络编程\\src\\com\\inte\\tcp\\bg17.jpg"));
            //写出文件
            byte[] buffer = new byte[1024];
            int len;
            while ((len=fis.read(buffer))!=-1) {
                os.write(buffer, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            if (fis!=null) {
                try {
                    fis.close();
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if (os!=null) {
                try {
                    os.close();
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if (socket!=null) {
                try {
                    socket.close();
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
