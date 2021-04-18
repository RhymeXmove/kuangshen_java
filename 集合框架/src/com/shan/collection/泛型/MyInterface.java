package com.shan.collection.泛型;

/**
 * 泛型接口
 * 语法, 接口名<T>
 * 注意，不能泛型静态常量
 */
public interface MyInterface<T> {
    String name = "张三";

    T server(T t);
}
