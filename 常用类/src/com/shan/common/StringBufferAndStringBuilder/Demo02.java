package com.shan.common.StringBufferAndStringBuilder;

public class Demo02 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 99999; i++) {
            str+=i;
        }

        long end = System.currentTimeMillis();

        System.out.println((float) (end-start)/1000 + "s");


        long start2 = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("");
        for (int i = 0; i < 99999; i++) {
            sb.append(i);
        }

        long end2 = System.currentTimeMillis();

        System.out.println(end2-start2 + "ms");

        long start3 = System.currentTimeMillis();
        StringBuilder sbu = new StringBuilder("");
        for (int i = 0; i < 99999; i++) {
            sbu.append(i);
        }

        long end3 = System.currentTimeMillis();

        System.out.println(end3-start3 + "ms");




    }
}
