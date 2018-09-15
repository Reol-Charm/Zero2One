package cn.itcast.day18.oncourse.ConcurrentExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/9 23:58
 * @version: 1.0
 */

public class FirstExecutor {
    /*1. 线程池的使用步骤:

            3.调用ExecutorService中的方法submit,传递线程任务(实现类),开启线程,执行run方法
            4.调用ExecutorService中的方法shutdown销毁线程池(不建议执行)*/
    public static void main(String[] args) {
        /* 1.使用线程池的工厂类Executors里边提供的静态方法newFixedThreadPool生产一个指定线程数量的线程池*/
        ExecutorService es = Executors.newFixedThreadPool(5);
        /*2.创建一个类,实现Runnable接口,重写run方法,设置线程任务*/
//        pool-1-thread-2
//        pool-1-thread-3
//        pool-1-thread-4
//        pool-1-thread-5
//        ------------main-------------//todo 为什么下面这种情况? 原理机制
//        这是第pool-1-thread-3个lambda表达式
//        这是第pool-1-thread-1个lambda表达式
//        这是第pool-1-thread-2个lambda表达式
        es.submit(() -> System.out.println(Thread.currentThread().getName()));
        es.submit(() -> System.out.println(Thread.currentThread().getName()));
        es.submit(() -> System.out.println(Thread.currentThread().getName()));
        es.submit(() -> System.out.println(Thread.currentThread().getName()));
        es.submit(() -> System.out.println(Thread.currentThread().getName()));
        es.submit(() -> System.out.println("这是第" + Thread.currentThread().getName() + "个lambda表达式"));
        es.submit(() -> System.out.println("这是第" + Thread.currentThread().getName() + "个lambda表达式"));
        es.submit(() -> System.out.println("这是第" + Thread.currentThread().getName() + "个lambda表达式"));
        String name = Thread.currentThread().getName();
        System.out.println("------------" + name + "-------------");

        /*其他静态方法*/
        ExecutorService nctp = Executors.newCachedThreadPool();
        ScheduledExecutorService nstp = Executors.newScheduledThreadPool(5);
        ExecutorService nste = Executors.newSingleThreadExecutor();
        nctp.submit(() -> System.out.println("Hello Lambda!" + name));
        nstp.submit(() -> System.out.println("Hello Lambda!" + name));
        nste.submit(() -> System.out.println("Hello Lambda!" + name));
    }
}
