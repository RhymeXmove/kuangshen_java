package com.shanxin.scanner;

import java.util.Scanner;

public class ScannerDemo01 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        if (a.hasNext()){
            String b = a.next();
            System.out.println(b);
        }

        a.close();

    }
}
