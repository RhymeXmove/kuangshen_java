package com.shanxin.oop.demo09;

public class Application {
    public static void main(String[] args) {
        Outer outer = new Outer();
        //通过外部类实现内部类
        outer.new Inner();

        Outer.Inner inner = outer.new Inner();
        inner.getID();


        //没有名字初始化类，不用将示例保存到变量中~
        //使用场景个，监听器，无限套娃~
        new Apple().eat();
    }
}

class Apple{
    public void eat() {
        System.out.println("1");
    }
}

interface UserService{

}
