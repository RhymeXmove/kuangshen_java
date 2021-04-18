package com.inte.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpReceiveDemo1 {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(6666);

        while(true){
            // prepare receive the packet
            byte[] container = new byte[1024];
            DatagramPacket packet = new DatagramPacket(container, 0, container.length);
            socket.receive(packet); // 阻塞式接收

            // 断开连接 bye
            byte[] data = packet.getData();
            String receiveData = new String(data, 0, data.length);
            System.out.print(receiveData);
            if (receiveData.equals("bye")) break;
        }
        socket.close();
    }
}
