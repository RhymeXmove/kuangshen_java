package com.file;

import java.io.File;

/**
 * 递归遍历文件夹
 */
public class File03 {
    public static void main(String[] args) {
        File dir = new File("D:\\workspace\\IDEA-workspace\\kuangshen_java\\IO流\\src\\com\\file\\aaa");
//        listDir(dir);
        delDir(dir);
    }


    public static void listDir(File dir) {

        File[] files = dir.listFiles();
        if (files != null && files.length>0) {
            for (File file : files) {
                if (file.isDirectory()){
                    listDir(file);
                }else {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }

    public static void delDir(File dir) {

        File[] files = dir.listFiles();
        if (files != null && files.length>0) {
            for (File file : files) {
                if (file.isDirectory()){
                    delDir(file);
                }else {
                    System.out.println(file.getAbsolutePath() + "删除文件" + file.delete());
                }
            }
        }
    }
}
