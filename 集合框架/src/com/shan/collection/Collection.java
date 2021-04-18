package com.shan.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(3);
        list.add(14);
        list.add(50);
        list.add(36);
        //排序
        System.out.println("排序之前---" + list.toString());
        Collections.sort(list);
        System.out.println("排序之后---" + list.toString());

        int i = Collections.binarySearch(list, 3);
        System.out.println("第" + i + "位");

        List<Integer> dest = new ArrayList<>();
        //开辟空间，否则dest为空，无法直接copy放入
        for (int j = 0; j < list.size(); j++) {
            dest.add(0);
        }
        Collections.copy(dest, list);
        System.out.println(dest.toString());

        //翻转
        Collections.reverse(list);
        System.out.println(list);

        //打乱
        Collections.shuffle(list);
        System.out.println(list);
    }
}
