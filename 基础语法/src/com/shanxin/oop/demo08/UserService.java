package com.shanxin.oop.demo08;

public interface UserService {
    //接口中的所有定义其实都是抽象的 public
    void add(String name);
    void del(String name);
    void upd(String name);
    void query(String name);

    //可以定义常量，但不建议使用。
    Integer AGE = 99;

}
