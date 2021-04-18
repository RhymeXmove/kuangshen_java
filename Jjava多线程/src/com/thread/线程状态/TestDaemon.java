package com.thread.线程状态;


//测试守护线程
public class TestDaemon {
    public static void main(String[] args) {
        God god = new God();
        Human human = new Human();

        Thread thread = new Thread(god);
        thread.setDaemon(true);  //默认是false表示用户线程，正常的线程都是用户线程

        thread.start();  // 用户线程启动
        new Thread(human).start();  //人类，用户线程启动

    }

}

// 上帝
class God implements Runnable{

    @Override
    public void run() {
        while(true){ // 按理来说不会结束 但作为守护线程在用户线程结束后 随之结束（可能会伴随虚拟机关闭的一点点延迟）
            System.out.println("legends never die！");
        }
    }
}

// 人类
class Human implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 365; i++) {
            System.out.println("happy live！");
        }
        System.out.println("Byebye, the worllllllllld!");  //nope!!!!!!!!!!
    }
}