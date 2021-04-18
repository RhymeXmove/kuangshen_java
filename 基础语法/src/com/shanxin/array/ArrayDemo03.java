package com.shanxin.array;

import java.sql.SQLOutput;

public class ArrayDemo03 {
    //稀疏数组
    public static void main(String[] args) {
        int[][] arr1 = new int[11][11];
        arr1[1][2] = 1;
        arr1[2][3] = 1;

        System.out.println("输出原始数组：");

        for (int[] ints : arr1) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.print("\n");
        }

        System.out.println("====================================");

        //转换为稀疏数组保存
        //获取有效值保存
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (arr1[i][j]!=0)
                    sum++;
            }
        }
        System.out.println("有效值得个数为：" + sum);


        System.out.println("===============遍历数组，将非0的值存储在稀疏数组中=====================");
        int[][] arr2 = new int[sum+1][3];

        arr2[0][0] = 11;
        arr2[0][1] = 11;
        arr2[0][2] = sum;

        //遍历数组，将非0的值存储在稀疏数组中
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j]!=0){
                    count++;
                    arr2[count][0] = i;
                    arr2[count][1] = j;
                    arr2[count][2] = arr1[i][j];
                }
            }
        }
        System.out.println("=============================================");
        System.out.println("输出稀疏数组：");

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i][0] + "\t"
                +arr2[i][1]+"\t"
                +arr2[i][2]+"\n");
        }

        System.out.println("===============================================");
        System.out.println("还原");
        int[][] arr3 = new int[arr2[0][0]][arr2[0][1]];

        //给其他元素0
        for (int i = 1; i < arr2.length; i++) {
            arr3[arr2[i][0]][arr2[i][1]] = arr2[i][2];
        }

        //打印arr3
        System.out.println("输出还原的数组：");
        for (int[] ints : arr3) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }

    }

}
