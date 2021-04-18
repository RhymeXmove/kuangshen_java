package com.thread.死锁;
// 死锁：多个线程互相拥有对方需要的资源，形成僵持
public class DeadLock  {
    public static void main(String[] args) {
        Makeup moore = new Makeup(0, "Moore");
        Makeup dove = new Makeup(1, "Dove");
        moore.start();
        dove.start();
    }

}

class Lipstick{
}
class Mirror{
}

class Makeup extends Thread{

    // 需要的资源只有一份，用static来保证只有一份
    static Lipstick lipstick = new Lipstick();
    static Mirror mirror = new Mirror();

    int choice; // 选择
    String girlName; // 使用化妆品的人

    Makeup(int choice, String girlName){
        this.choice = choice;
        this.girlName = girlName;
    }
    @Override
    public void run() {
        // 化妆
        try {
            Makeup();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    // 化妆 互相持有对方的锁，就是需要拿到对方的资源
    private void Makeup() throws InterruptedException {
        if(choice == 0){
            synchronized (lipstick){
                // 获得口红的锁
                System.out.println(this.girlName + "获得口红的锁");
                Thread.sleep(1000);
            }
            synchronized (mirror){
                // 获得镜子的锁
                System.out.println(this.girlName + "获得镜子的锁");
            }

        }else{
            synchronized (mirror){
                // 获得口红的锁
                System.out.println(this.girlName + "获得镜子的锁");
                Thread.sleep(2000);

            }

            synchronized (lipstick){
                // 获得镜子的锁
                System.out.println(this.girlName + "获得口红的锁");
            }

        }
    }
}