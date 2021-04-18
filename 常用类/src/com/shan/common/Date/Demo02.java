package com.shan.common.Date;

import sun.util.resources.de.CalendarData_de;

import java.lang.reflect.Field;
import java.util.Calendar;

public class Demo02 {
    public static void main(String[] args) {
        //创建Calendar对象
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime().toString());
        System.out.println(calendar.getTimeInMillis());

        //获取时间信息
        //获取年
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int date = calendar.get(Calendar.DATE);
        int hour = calendar.get(Calendar.HOUR); //12时制
        int hour2 = calendar.get(Calendar.HOUR_OF_DAY);//24时制
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        int week = calendar.get(Calendar.DAY_OF_WEEK);
        String[] arr = {"日", "一", "二", "三", "四", "五", "六"};
        String week2 = arr[week-1];
        System.out.println(year + "/" + (month+1) + "/" + date  + "-" + hour + "("+ hour2 +")"  + ":" + minute + ":" + second + "-[星期" + week2 + "]");

        //修改时间
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(Calendar.DAY_OF_MONTH, 5);
        System.out.println(calendar1.getTime().toLocaleString());

        //add方法修改时间
        calendar1.add(Calendar.HOUR, 1);
        System.out.println(calendar1.getTime().toLocaleString());

        //补充方法
        int max = calendar1.getActualMaximum(Calendar.DAY_OF_MONTH); //本月最大多少天
        int min =  calendar1.getActualMinimum(Calendar.DAY_OF_MONTH);//本月最小多少天？
        System.out.println(max);
        System.out.println(min);

        calendar1.add(Calendar.MONTH, 1);
        System.out.println(calendar1.getTime().toLocaleString());

        int max2 = calendar1.getActualMaximum(Calendar.DAY_OF_MONTH); //本月最大多少天
        int min2 =  calendar1.getActualMinimum(Calendar.DAY_OF_MONTH);//本月最小多少天？
        System.out.println(max2);
        System.out.println(min2);

    }
}
