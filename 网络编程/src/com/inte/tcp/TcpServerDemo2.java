package com.inte.tcp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

//服务端接收文件
public class TcpServerDemo2 {
    public static void main(String[] args) {
        //创建服务
        ServerSocket serverSocket = null;
        //监听客户端的连接
        Socket socket = null;
        //获取输入流
        InputStream is = null;
        //文件输出
        FileOutputStream fos = null;

        try {
            serverSocket = new ServerSocket(9000);
            socket = serverSocket.accept(); //阻塞式监听，会一直等待客户端连接
            is = socket.getInputStream();
            fos = new FileOutputStream(new File("D:\\workspace\\IDEA-workspace\\kuangshen_java\\网络编程\\src\\com\\inte\\tcp\\" + Math.random()*1000000000 + ".jpg"));
            byte[] buffer = new byte[1024];
            int len = 0;
            while ((len=is.read(buffer))!=-1){
                fos.write(buffer, 0, len);
                System.out.println("接收文件.....");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            if (fos!=null) {
                try {
                    fos.close();
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if (is!=null) {
                try {
                    is.close();
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

            if (serverSocket!=null) {
                try {
                    serverSocket.close();
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
