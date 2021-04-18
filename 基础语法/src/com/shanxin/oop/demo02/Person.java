package com.shanxin.oop.demo02;

public class Person {
    String name;

    //构造器，无参构造
    public Person() {
    }

    //无参构造
    public  Person(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println("说了一句话");
    }

}
