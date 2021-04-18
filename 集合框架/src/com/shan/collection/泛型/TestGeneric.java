package com.shan.collection.泛型;


public class TestGeneric {
    public static void main(String[] args) {
        MyGeneric<String> myGeneric = new MyGeneric<String>();
        myGeneric.t = "hello";
        myGeneric.show("大家好，加油");
        String str = myGeneric.getT();
        System.out.println(str);

        MyGeneric<Integer> myGeneric2 = new MyGeneric<>();
        myGeneric2.t = 100;
        myGeneric2.show(200);
        Integer integer = myGeneric2.getT();
        System.out.println(integer);

        //myinterface
        MyInterfaceImpl impl = new MyInterfaceImpl();
        impl.server("xxxxxxxxxx");

        //myinterfaceimpl2
        MyInterfanceImpl2<Integer> impl2 = new MyInterfanceImpl2<>();
        impl2.server(1000);
        MyInterfanceImpl2<String> impl3 = new MyInterfanceImpl2<>();
        impl3.server("ccccccccccc");

        //泛型方法
        MyGenericMethod myGenericMethod = new MyGenericMethod();
        myGenericMethod.show("bbbb");
        myGenericMethod.show(200);
        myGenericMethod.show(1.23);

    }
}
