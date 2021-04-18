package com.shan.common.Date;

import java.util.Date;

public class Demo01 {
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println(date1.toString());
        System.out.println(date1.toLocaleString());

        //昨天
        Date date2 = new Date(date1.getTime() - (60*60*24*1000));
        System.out.println(date2.toLocaleString());


        //方法after before
        boolean b1 = date1.after(date2);
        System.out.println(b1);

        boolean b2 = date1.before(date2);
        System.out.println(b2);


        //比较compareTo(),比较毫秒值
        int d1 = date1.compareTo(date2);
        System.out.println(d1);

        int d2 = date1.compareTo(date1);
        System.out.println(d2);

        //比较是否相等
        boolean b3 = date1.equals(date2);
        System.out.println(b3);

    }
}
