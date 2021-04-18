package com.thread.可重入锁;

import java.util.concurrent.locks.ReentrantLock;

public class TestLock {
    public static void main(String[] args) {
        TestLock2 ticket = new TestLock2();

        new Thread(ticket, "小明").start();
        new Thread(ticket, "小二").start();
        new Thread(ticket, "阿黄").start();
    }
}

class TestLock2 implements Runnable {
    //票数
    int ticketNum = 10;

    //定义Lock锁
    private final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock.lock();
                if (ticketNum > 0) {
                    System.out.println(Thread.currentThread().getName() + "------拿到了第" + ticketNum-- + "张票------");
                }

                else {
                    break;
                }
            }finally {
                lock.unlock();
            }
        }
    }
}