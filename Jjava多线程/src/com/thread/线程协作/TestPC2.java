package com.thread.线程协作;

/**
 * 信号灯法
 */
public class TestPC2 {
    public static void main(String[] args) {
        TV tv = new TV();
        new Player(tv).start();
        new Watcher(tv).start();
    }
}

// 生产者 --> 饭店
class Player extends Thread{
    TV tv;
    public Player(TV tv){
        this.tv = tv;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0){
                this.tv.play("商品一：黑森林蛋糕");
            }else{
                this.tv.play("商品一：水果蛋糕");
            }
        }
    }
}
// 消费者 --> 食客
class Watcher extends Thread{
    TV tv;
    public Watcher(TV tv){
        this.tv = tv;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            tv.watch();
        }
    }
}

// 产品 --> 节目
class TV{
    // 演员表演，观众等待 T
    // 观众观看，演员等待 F
    String voice; // 表演的节目
    boolean flag = true;
    // 表演
    public synchronized void play(String voice){

        if (!flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("厨师制作了:" + voice);
        // 通知观众观看
        this.notifyAll(); // 通知唤醒
        this.voice = voice;
        this.flag = !this.flag;
    }
    // 观看
    public synchronized void watch(){
        if (flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("购买了：" + voice);
        // 通知蛋糕师做蛋糕
        this.notifyAll();
        this.flag = !this.flag;
    }
}
