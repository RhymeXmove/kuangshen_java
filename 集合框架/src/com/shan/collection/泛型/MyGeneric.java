package com.shan.collection.泛型;

/**
 * 泛型类
 * T是类型占位符，表示一种引用类型，如果编写多个使用逗号隔开
 */
public class MyGeneric<T> {
    T t;
    public void show(T t) {
        System .out.println("泛型类" + t);
    }
    public T getT() {
        return t;
    }
}
