package com.inte.tcp;

import sun.plugin2.gluegen.runtime.BufferFactory;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

//服务端
public class TcpServerDemo1 {
    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream is = null;
        ByteArrayOutputStream bs = null;
        try {
            //有一个服务器地址
             serverSocket = new ServerSocket(9999);
            //等待客户端连接
            socket = serverSocket.accept();
            //读取客户端的信息
            is = socket.getInputStream();

            //管道流
            bs = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1) {
                bs.write(buffer, 0, len);
            }

            System.out.println(bs.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bs != null) {
                try {
                    bs.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            if (is != null) {
                try {
                    is.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }

            if (socket != null) {
                try {
                    socket.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }

            if (serverSocket != null) {
                try {
                    serverSocket.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }







    }
}
