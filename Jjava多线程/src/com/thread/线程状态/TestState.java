package com.thread.线程状态;

/**
 * 观察测试线程的状态
 */
public class TestState {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        });

        System.out.println("---------------");

        //观察状态
        Thread.State state = thread.getState();
        System.out.println(state); //NEW

        //观察启动后
        thread.start();
        state = thread.getState();
        System.out.println(state); //RUN

        while (state != Thread.State.TERMINATED) { //只要线程不终止，就一直输出状态
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            state = thread.getState();  //更新线程状态
            System.out.println(state);
        }

        thread.start();  //死亡的线程不能在启动，必须再new一个

    }
}
