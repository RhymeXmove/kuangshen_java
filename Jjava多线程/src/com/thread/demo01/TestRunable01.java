package com.thread.demo01;

/**
 * 创建线程方式2： 实现 Runable 接口，重写run方法，执行线程需要丢入runable接口实现类，调用start方法
 */
public class TestRunable01 implements Runnable {
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
        //创建一个Runable接口的实现对象
        TestRunable01 testRunable01 = new TestRunable01();

        //创建线程对象，通过线程对象来开启线程，这种方式叫做代理
        new Thread(testRunable01).start();

        for (int i = 0; i < 20000; i++) {
            System.out.println("我在学习多线程--"  + i);
        }
    }
}
