package com.shan.collection.Set;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo06 {

    /**
     * 要求使用TreeSet 集合实现字符串按照长度进行排序；
     * helloWord  zhang  lisi  wangwu  beijing  xian  nanjing
     * @authoe sx
     */
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int n1 = o1.length()-o2.length();
                int n2 = o1.compareTo(o2);
                return n1==0?n2:n1;
            }
        });
        //添加数据
        treeSet.add("helloWord");
        treeSet.add("zhang");
        treeSet.add("lisi");
        treeSet.add("wangwu");
        treeSet.add("beijing");
        treeSet.add("xian");
        treeSet.add("nanjing");
        System.out.println(treeSet.toString());

    }
}
