package com.thread.线程协作;

// 测试 生产者消费者模型 --> 利用缓冲区解决：管程法
// 有问题，会出现先消费后生产，要用队列实现

public class TestPC {
    public static void main(String[] args) {
        SynBuffer synBuffer = new SynBuffer();

        new Producer(synBuffer).start();
        new Consumer(synBuffer).start();
    }
}

// 生产者
class Producer extends Thread{
    SynBuffer buffer;
    public Producer(SynBuffer buffer){
        this.buffer = buffer;
    }
    // 生产

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("生产了" + i +"只鸡");
            try {
                buffer.push(new Chicken(i));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// 消费者
class Consumer extends Thread{
    SynBuffer buffer;
    public Consumer(SynBuffer buffer){
        this.buffer = buffer;
    }

    // 消费

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                System.out.println("消费了-->" + buffer.pop().id +"只鸡");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// 产品
class Chicken{
    int id; // 产品编号

    public Chicken(int id) {
        this.id = id;
    }
}

// 缓冲区
class SynBuffer{

    //容器大小
    Chicken[] chickens = new Chicken[10];
    // 容器计数器
    int count = 0;

    // 生产者放入产品
    public synchronized void push(Chicken chicken) throws InterruptedException {
        // 如果容器满了，需要等待消费者消费
        if(count == chickens.length){
            // 通知消费者消费，生产等待
            this.wait();
        }
        // 如果没有满，需要丢入产品
        chickens[count] = chicken;
        count ++;
        // 可以通知消费者消费了
        this.notifyAll();
    }

    // 消费者消费产品
    public synchronized Chicken pop() throws InterruptedException {
        // 判断能否消费
        if(count == 0){
            /// 等待生产者生产，消费者等待
            this.wait();
        }
        // 如果可以消费
        count --;
        Chicken chicken = chickens[count];
        // 吃完了，通知生产者生产
        this.notifyAll();

        return chicken;
    }
}