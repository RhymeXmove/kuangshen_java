package com.shan.collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map 接口的的使用
 * 特点：（1）存储键值对 （2）键不能重复，值可以重复 （3）无序
 */
public class Demo01 {
    public static void main(String[] args) {
        //创建Map集合
        Map<String, String> map = new HashMap<>();

        map.put("cn", "中国");
        map.put("uk", "英国");
        map.put("fc", "法国");
        map.put("gm", "德国");

        System.out.println("元素个数：" + map.size());
        System.out.println(map.toString());

        //删除
//        map.remove("fc");
//        System.out.println(map.toString());

        //遍历
        //使用keySet()方法
        System.out.println("----------keySet---------------");
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key + ":" + map.get(key));
        }
        System.out.println("----------entrySet---------------");
//        使用entrySet方法
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}
