package com.jvmlearn;
// 沙箱安全机制
public class Test {
    public static void main(String[] args) {
        new Test().a();
    }

    public void a() {
        b();
    }

    public void b() {
        a();
    }
}
