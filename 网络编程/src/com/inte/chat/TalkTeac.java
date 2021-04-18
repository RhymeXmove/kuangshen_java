package com.inte.chat;

public class TalkTeac {
    public static void main(String[] args) {
        new Thread(new TalkSend(5555, "localhost", 8899)).start();
        new Thread(new TalkReceive(9988, "Stu")).start();
    }
}