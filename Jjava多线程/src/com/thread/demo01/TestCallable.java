package com.thread.demo01;

import java.util.concurrent.*;

public class TestCallable implements Callable {
    private String url;
    private String name;

    public TestCallable(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public Object call() throws Exception {
        WebDownLoader wd = new WebDownLoader();
        wd.downloader(url,name);
        System.out.println("下载文件，名为---" + name);
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestCallable t1 = new TestCallable
                ("https://pics2.baidu.com/feed/902397dda144ad348afc39466dd25efc30ad852d.jpeg?token=4f48564797f3e5ddda4bb40071f78be5", "t1.jpg");
        TestCallable t2 = new TestCallable
                ("https://pics2.baidu.com/feed/902397dda144ad348afc39466dd25efc30ad852d.jpeg?token=4f48564797f3e5ddda4bb40071f78be5", "t2.jpg");
        TestCallable t3 = new TestCallable
                ("https://pics2.baidu.com/feed/902397dda144ad348afc39466dd25efc30ad852d.jpeg?token=4f48564797f3e5ddda4bb40071f78be5", "t3.jpg");

        //1.创建执行服务
        ExecutorService serv = Executors.newFixedThreadPool(3); //线程池，并发数

        //2.提交执行
        Future<Boolean> r1 = serv.submit(t1);
        Future<Boolean> r2 = serv.submit(t2);
        Future<Boolean> r3 = serv.submit(t3);
        //3.获取结果
        boolean rs1 = r1.get();
        boolean rs2 = r2.get();
        boolean rs3 = r3.get();

        System.out.println(rs1);
        System.out.println(rs2);
        System.out.println(rs3);

        //4.关闭服务
        serv.shutdownNow();
    }


}
