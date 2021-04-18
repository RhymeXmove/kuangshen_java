package com.shan.common.时间戳;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01 {
    public static void main(String[] args) throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        Date date = new Date();
        String str = sdf.format(date);
        System.out.println(str);

        Date date2 = sdf.parse("1990/05/01");
        System.out.println(date2);
    }
}
