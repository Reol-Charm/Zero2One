package cn.itcast.day18.homework.practice08;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/10 11:37
 * @version: 1.0
 */

public class ThreadPoolTest {
    public static void main(String[] args) {
        int i = Runtime.getRuntime().availableProcessors();
//        4
        System.out.println(i);
        ExecutorService es = Executors.newFixedThreadPool(3);
        MyRunnable r = new MyRunnable();

        es.submit(r);
        es.submit(r);
        es.submit(r);
        es.submit(r);
//        es.submit(r);
    }

}
