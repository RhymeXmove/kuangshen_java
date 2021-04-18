package com.file;

import java.io.File;
import java.io.FileFilter;

/**
 * FileFilter
 */
public class File02 {
    public static void main(String[] args) {
        File dir = new File("D:\\workspace\\IDEA-workspace\\kuangshen_java\\IO流\\src\\com\\file\\aaa\\bbb\\ccc");


        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.getName().endsWith(".bin")){
                    return true;
                }
                return false;
            }
        });

        for (File file : files) {
            System.out.println(file.getName());
        }

    }
}
