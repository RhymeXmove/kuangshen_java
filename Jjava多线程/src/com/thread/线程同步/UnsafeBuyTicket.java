package com.thread.线程同步;
//不安全买票
// 线程不安全，有负数
public class UnsafeBuyTicket {
    public static void main(String[] args) {
        BuyTicket station = new BuyTicket();

        new Thread(station, "牡丹").start();
        new Thread(station, "井盖").start();
        new Thread(station, "肥鯮 ").start();
    }
}

class BuyTicket implements Runnable{
    // 票
    private int ticketNum = 10;
    boolean flag = true; // 外部停止方式
    @Override
    public void run() {
        // 买票
        while(true){
            try {
                buy();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private synchronized void buy() throws InterruptedException {
        // 判断是否有票
        if(ticketNum <= 0){
            flag = false;
            return;
        }

        //模拟延时
        Thread.sleep(100);

        // 买票
        System.out.println(Thread.currentThread().getName() + "买到了" + ticketNum--);
    }
}
