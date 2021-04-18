package com.thread.demo01;

public class TestLove {

    public static void main(String[] args) {

        ILove love = a-> System.out.println("I love --" + a);

        love.love("zzz");

    }
}

interface ILove { void love(String a);}