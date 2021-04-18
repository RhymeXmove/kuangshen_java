package com.inte.chat;

public class TalkStu {
    public static void main(String[] args) {
        // 开启两个线程
        new Thread(new TalkSend(7878, "localhost", 9988)).start();
        new Thread(new TalkReceive(8899, "teac")).start();
    }
}
