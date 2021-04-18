package com.annotation.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//通过反射动态创建对象
public class Test08 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //获得Class对象
        Class<?> c1 = Class.forName("com.annotation.reflection.User");

        //构造一个对象
        User user = (User)c1.newInstance(); //本质是调用了类的无参构造器
        System.out.println(user);

        //通过构造器创建对象
        Constructor constructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        User user2 = (User)constructor.newInstance("shan", 001, 18);
        System.out.println(user2);

        //通过反射调用普通方法
        User user3 = (User)c1.newInstance();
        //通过反射获取一个方法
        Method setName = c1.getDeclaredMethod("setName", String.class);
        //invoke 激活
        //invoke（对象， “方法的值”）
        setName.invoke(user3,"shanx");
        System.out.println(user3.getName());

        //通过反射操作属性
        User user4 = (User)c1.newInstance();
        Field name = c1.getDeclaredField("name");
        //默认状态下不能直接操作私有属性，我们需要关闭程序的安全检测，属性或者方法的setAccessible(true); 此处true为关
        // 会降低程序效率
        name.setAccessible(true);
        name.set(user4, "shanx-2");
        System.out.println(user4.getName());

    }
}
