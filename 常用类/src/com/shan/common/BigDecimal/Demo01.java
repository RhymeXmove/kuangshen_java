package com.shan.common.BigDecimal;

import java.math.BigDecimal;

public class Demo01 {
    public static void main(String[] args) {
        double d1 = 1.0;
        double d2 = 0.9;
        System.out.println("d1-d2=" + (d1-d2));

        double res = (1.4-0.5)/0.9;
        System.out.println("result=" + res);


        BigDecimal bd1 = new BigDecimal("1.0");
        BigDecimal bd2 = new BigDecimal("0.9");

        BigDecimal bdres1 = bd1.add(bd2);
        BigDecimal bdres2 = bd1.subtract(bd2);
        BigDecimal bdres3 = bd1.multiply(bd2);
        BigDecimal bdres4 = bd1.divide(bd2,2,BigDecimal.ROUND_HALF_UP);
        System.out.println("加="+bdres1+"\n减="+bdres2+"\n乘="+bdres3+"\n除="+bdres4);

    }
}
