package com.thread.线程同步;

import java.util.concurrent.CopyOnWriteArrayList;

public class TestJUC {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 100; i++) {
            new Thread( () ->{
                list.add(Thread.currentThread().getName());
            } ).start();

            try {
                Thread.sleep(30);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(list.size());
        }

    }
}
