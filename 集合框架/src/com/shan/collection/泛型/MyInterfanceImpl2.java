package com.shan.collection.泛型;

public class MyInterfanceImpl2<T> implements MyInterface<T> {

    @Override
    public T server(T t) {
        System.out.println("泛型接口" + t);
        return t;
    }
}
