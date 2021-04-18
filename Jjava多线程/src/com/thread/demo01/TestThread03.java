package com.thread.demo01;

/**
 * 多个县城同时操作一个对象
 * 买火车票的例子
 */
public class TestThread03 implements Runnable {
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
        TestThread03 ticket = new TestThread03();

        new Thread(ticket, "小明").start();
        new Thread(ticket, "小二").start();
        new Thread(ticket, "阿黄").start();
    }
}
