package com.shanxin.oop.demo03;

public class Application {
    public static void main(String[] args) {
        Pet dog = new Pet();
        dog.name = "旺财";
        dog.age = 3;



        System.out.print(dog.name);
        System.out.print(dog.age);

        dog.shout();
    }
}
