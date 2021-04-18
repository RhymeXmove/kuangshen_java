package com.inte.demo1;

import java.net.InetAddress;
import java.net.InetSocketAddress;

public class TestInterAddress {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress1 = InetAddress.getByName("127.0.0.1");
            System.out.println(inetAddress1);

            InetAddress inetAddress2 = InetAddress.getByName("localhost");
            System.out.println(inetAddress2);

            InetAddress inetAddress3 = InetAddress.getLocalHost();
            System.out.println(inetAddress3);

            InetSocketAddress inetSocketAddress = new InetSocketAddress("127.0.0.1", 8080);
            System.out.println(inetSocketAddress);

            //查询网站IP地址
            InetAddress inetAddress4 = InetAddress.getByName("www.baidu.com");
            System.out.println(inetAddress4);

            System.out.println( inetAddress4.getCanonicalHostName());
            System.out.println( inetAddress4.getHostAddress());
            System.out.println( inetAddress4.getHostName());
            System.out.println( inetAddress4.getClass());


        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
