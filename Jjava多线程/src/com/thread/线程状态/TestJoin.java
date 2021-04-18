package com.thread.线程状态;

public class TestJoin implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println("★ VIP Thread ☆" + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TestJoin testJoin = new TestJoin();
        Thread thread = new Thread(testJoin);
        thread.start();

        // 主线程
        for (int i = 0; i < 500; i++) {
            if(i == 200){
                thread.join(); // 插队
            }
            System.out.println("main" + i);
        }
    }
}
