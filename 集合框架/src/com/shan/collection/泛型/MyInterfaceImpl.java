package com.shan.collection.泛型;

public class MyInterfaceImpl implements MyInterface<String> {

    @Override
    public String server(String t) {
        System.out.println("泛型接口" + t);
        return t;
    }
}
