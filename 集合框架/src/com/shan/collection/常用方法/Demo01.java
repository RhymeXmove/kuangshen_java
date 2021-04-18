package com.shan.collection.常用方法;

import java.util.*;

public class Demo01 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        collection.add("ddd");
        collection.add("eee");
        collection.add("fff");
        System.out.println("元素个数：" + collection.size());


        //删除元素
//        collection.remove("ccc");
//        System.out.println("删除之后" + collection.size());
//
//        collection.clear();
//        System.out.println("删除之后" + collection.size());

        //增强for遍历集合
        for (Object o : collection) {
            System.out.println(o);
        }

        System.out.println("---------------------------------------------");
        //迭代器遍历集合
        //haNext(); 有没有下一个元素
        //next(); 获取下一个元素
        //remove(); 删除当前元素
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);
            // 可以使用it.remove(); 进行移除元素
            // collection.remove(); 不能用  collection其他方法 会报并发修改异常
        }

        //列表迭代器
        List list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        ListIterator li = list.listIterator();
        while(li.hasNext()){
            System.out.println(li.nextIndex() + ":" + li.next()); //从前往后遍历
        }

        while(li.hasPrevious()){
            System.out.println(li.previousIndex() + ":" + li.previous()); //从后往前遍历
        }

    }
}
