package com.file;

import java.io.File;
import java.nio.file.Files;
import java.util.Date;

import static java.io.File.separator;

public class File01 {
    /**
     * 分隔符
     * 文件操作
     * 文件夹操作
     * @param args
     */
    public static void main(String[] args) throws Exception {
        separator();
        fileOpen();
        directoryOpe();
    }

    // 1. 分隔符
    public static void separator() {
        System.out.println("路径分隔符" + File.pathSeparator);
        System.out.println("名称分隔符" + File.separator);
    }

    // 2. 文件操作
    public static void fileOpen() throws Exception {
        //创建文件
        File file = new File("D:\\workspace\\IDEA-workspace\\kuangshen_java\\IO流\\src\\com\\file\\file.txt");
        if (!file.exists()) {
            boolean b = file.createNewFile();
            System.out.println("创建结果" + b);
        }else {
            System.out.println("文件已存在");
        }

        //删除文件-直接删除
//           System.out.println(file.delete());
        //删除文件 jvm退出时删除
//           file.deleteOnExit();
//           Thread.sleep(5000);


        //获取文件绝对路径
        System.out.println("文件绝对路径:" + file.getAbsolutePath());
        //获取写的路径
        System.out.println(file.getPath());
        //获取文件名称
        System.out.println(file.getName());
        //获取父目录
        System.out.println(file.getParent());
        //获取文件长度
        System.out.println(file.length());
        //获取文件创建时间
        System.out.println(new Date(file.lastModified()).toLocaleString());

        //判断
        //是否可写
        //System.out.println(file.canWrite());  //linux支持
        //是否可读
        System.out.println(file.canRead());
        //是否是文件
        System.out.println(file.isFile());
        //是否隐藏
        System.out.println(file.isHidden());

    }

    public static void directoryOpe() throws Exception{
        File dir = new File("D:\\workspace\\IDEA-workspace\\kuangshen_java\\IO流\\src\\com\\file\\aaa\\bbb\\ccc");
        System.out.println(dir.toString());
        if (!dir.exists()) {
            //创建单级目录
//            dir.mkdir();
            //创建多级目录
            System.out.println("创建结果" + dir.mkdirs());
        }

        //删除文件
        //直接删除
//        System.out.println(dir.delete()); //只能删除空目录
        //使用jvm删除
//        dir.deleteOnExit();
//        Thread.sleep(3000);

        //获取文件夹信息
        //获取绝对路径
        System.out.println(dir.getAbsolutePath());
        //获取路径
        System.out.println(dir.getPath());
        //获取名称
        System.out.println(dir.getName());
        //获取父目录
        System.out.println(dir.getParent());
        //获取创建时间
        System.out.println(new Date(dir.lastModified()).toLocaleString());

        //判断
        //是否是文件夹
        System.out.println(dir.isDirectory());
        //是否隐藏
        System.out.println(dir.isHidden());

        //遍历文件夹
        File dir2 = new File("D:\\workspace\\IDEA-workspace\\kuangshen_java\\IO流\\src\\com\\file");
        String[] dirs = dir2.list();
        //File[] dirs2 = dir2.listFiles();
        for (String s : dirs) {
            System.out.println(s);
        }

    }

}
