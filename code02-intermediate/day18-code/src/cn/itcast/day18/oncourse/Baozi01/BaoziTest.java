package cn.itcast.day18.oncourse.Baozi01;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/9 17:23-18:45;NullPointerException
 * @version: 1.0
 */

public class BaoziTest {
    public static void main(String[] args) {
        Goods gds = new Goods();
        /*将锁对象传入两个线程类中*/
        Consumer cs = new Consumer(gds);
        Producer pr = new Producer(gds);
//        Goods gds = new Goods();

        new Thread(pr, "商店").start();
        new Thread(cs, "顾客").start();
    }

}
