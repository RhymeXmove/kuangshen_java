package com.thread.demo01;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * 实现多线程同步下载图片
 */
public class TestThread2 extends Thread {
    private String url;
    private String name;

    public TestThread2(String url, String name) {
        this.url = url;
        this.name = name;
    }


    @Override
    public void run() {
        WebDownLoader webDownLoader = new WebDownLoader();
        webDownLoader.downloader(url,name);
        System.out.println("下载文件名为:" + name);

    }

    public static void main(String[] args) {
        TestThread2 t1 = new TestThread2
                ("https://pics2.baidu.com/feed/902397dda144ad348afc39466dd25efc30ad852d.jpeg?token=4f48564797f3e5ddda4bb40071f78be5", "t1.jpg");
        TestThread2 t2 = new TestThread2
                ("https://pics2.baidu.com/feed/902397dda144ad348afc39466dd25efc30ad852d.jpeg?token=4f48564797f3e5ddda4bb40071f78be5", "t2.jpg");
        TestThread2 t3 = new TestThread2
                ("https://pics2.baidu.com/feed/902397dda144ad348afc39466dd25efc30ad852d.jpeg?token=4f48564797f3e5ddda4bb40071f78be5", "t3.jpg");
        t1.start();
        t2.start();
        t3.start();
    }



}

//下载器
class WebDownLoader {
    //下载方法
    public void downloader(String url, String name) {
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("io异常，downloader方法出现问题");
        }
    }
}
