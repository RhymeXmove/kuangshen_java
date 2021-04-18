package com.inte.download;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class UrlDownload {
    public static void main(String[] args) throws Exception {
        // 1. download Address
        URL url = new URL("url"); // 网络资源地址
        // 2. connect HTTP
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        InputStream inputStream = urlConnection.getInputStream();

        FileOutputStream fos = new FileOutputStream("fileName.txt"); // 下来的命名

        byte[] buffer = new byte[1024];
        int len;
        while((len = inputStream.read(buffer)) != -1){
            fos.write(buffer, 0, len); // 写出数据
        }
        fos.close();
        inputStream.close();
        urlConnection.disconnect(); // 断开连接
    }
}