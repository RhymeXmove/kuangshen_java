package com.thread.demo01;

/**
 * 创建线程方式一，继承thread类，重写run()方法，调用start开启线程
 */
public class TestThread01 extends Thread {
    //run方法线程体
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("我在看代码--" + i);
        }
    }

    //执行下面代码
    public static void main(String[] args) {
        //main线程，主线程
        //创建一个线程对象
        TestThread01 testThread01 = new TestThread01();

        //调用Start() 方法开启线程
        testThread01.start();

        for (int i = 0; i < 20000; i++) {
            System.out.println("我在学习多线程--"  + i);
        }
    }
}
