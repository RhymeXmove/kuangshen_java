package com.shanxin.struct;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        if (scanner.hasNext()) {
            str = scanner.next();
            switch (str) {
                case "单鑫":
                    System.out.println("true");
                    break;
                case "123":
                    System.out.println("false");
                    break;
                default:
                    System.out.println("None");
            }

        }
    }
}

