package com.thread.线程状态;

/**
 * 测试礼让程序
 * 礼让不一定成功，看CPU心情
 */
public class TestYield implements Runnable {
    public static void main(String[] args) {
        TestYield testYield =  new TestYield();

        new Thread(testYield, "a").start();
        new Thread(testYield, "b").start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程开始执行");
        Thread.yield();
        System.out.println(Thread.currentThread().getName() + "线程停止执行");
    }
}
