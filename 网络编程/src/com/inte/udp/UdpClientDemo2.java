package com.inte.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpClientDemo2 {
    public static void main(String[] args) throws Exception {
        //开放端口
        DatagramSocket socket = new DatagramSocket(9090);

        //接收数据包
        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, 0, buffer.length);

        socket.receive(packet);  //阻塞接受

        System.out.println(new String(packet.getData(), 0, packet.getLength() ));

        socket.close();
    }
}
