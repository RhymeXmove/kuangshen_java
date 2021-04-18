package com.thread.线程状态;

import com.thread.demo01.TestThread03;

/**
 * 模拟网络延时: 放大问题的发生性
 */
public class TestSleep implements Runnable {
    //票数
    private static int ticketNum = 10;

    @Override
    public void run() {
        while (true) {
            if (ticketNum<=0){
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "------拿到了第" + ticketNum-- + "张票------");
        }
    }

    public static void main(String[] args) {
        TestSleep ticket = new TestSleep();

        new Thread(ticket, "小明").start();
        new Thread(ticket, "小二").start();
        new Thread(ticket, "阿黄").start();
    }
}
