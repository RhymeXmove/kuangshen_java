package com.thread.demo01;
// 静态代理模式：
// 真实对象和代理对象都要实现同一个接口
// 代理对象要代理真实角色

// 好处 ：
// 1. 代理对象可以做很多真实对象做不了的事情
// 2. 真实对象专注做自己的事情

public class StaticProxy {

    public static void main(String[] args) {

        You you = new You(); // 真实对象
        new Thread(() -> System.out.println("i love you")).start(); // lambda表达式

//        //传统调用方式
//        You you = new You();
//        you.HappyMarry();

        new WeddingCompany(new You()).HappyMarry();
        //代理调用
//        WeddingCompany weddingCompany = new WeddingCompany(new You());
//        weddingCompany.HappyMarry();

    }
}

interface Marry {
    void HappyMarry();
}


//真实角色，你去结婚
class You implements Marry {
    @Override
    public void HappyMarry() {
        System.out.println("结婚，超开心(^_^)"); //no-qinjiang
    }
}

//代理角色，帮助你结婚, 起到帮助作用
class WeddingCompany implements Marry {
    //代理谁 --> 真实目标角色
    private Marry target;

    public WeddingCompany(Marry target) {
        this.target = target;
    }

    @Override
    public void HappyMarry() {
        before();
        this.target.HappyMarry();
        after();
    }



    private void before() {
        System.out.println("布置婚礼现场");
    }

    private void after() {
        System.out.println("还债结尾款");
    }
}