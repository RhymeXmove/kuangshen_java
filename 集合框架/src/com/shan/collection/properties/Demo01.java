package com.shan.collection.properties;

import java.io.*;
import java.util.Map;
import java.util.Properties;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        //创建集合
        Properties properties = new Properties();
        //添加数据
        properties.setProperty("username", "zhangsan");
        properties.setProperty("age", "20");
        System.out.println(properties);

        //遍历
        //keyset
        for (Object o : properties.keySet()) {
            System.out.println(o);
        }

        //entrySet
        for (Map.Entry<Object, Object> objectObjectEntry : properties.entrySet()) {
            System.out.println(objectObjectEntry);
        }

        //stringPropertyName
        for (String stringPropertyName : properties.stringPropertyNames()) {
            System.out.println(stringPropertyName + ":" + properties.getProperty(stringPropertyName));
        }

        //和流有关的方法
//        PrintWriter pw = new PrintWriter("D:\\workspace\\IDEA-workspace\\kuangshen_java\\集合框架\\src\\com\\shan\\collection\\properties\\print.properties");
//        properties.list(pw);
//        pw.close();

        //store方法
//        FileOutputStream fos = new FileOutputStream("D:\\workspace\\IDEA-workspace\\kuangshen_java\\集合框架\\src\\com\\shan\\collection\\properties\\print.properties");
//        properties.store(fos, "注释");
//        fos.close();

//        load方法
        Properties properties2 = new Properties();
        FileInputStream fis = new FileInputStream("D:\\workspace\\IDEA-workspace\\kuangshen_java\\集合框架\\src\\com\\shan\\collection\\properties\\\\print.properties");
        properties2.load(fis);
        fis.close();
        System.out.println(properties2.toString());
    }
}
