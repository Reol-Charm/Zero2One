package cn.itcast.day18.homework.practice09;

/**
 * @Description: java类作用描述
 * @Author: hk
 * @CreateDate: 2018-08-10$ 15:48$
 * @Version: 1.0
 */

public class shopdemo {
    public static void main(String[] args) {
        shop s = new shop();
        get1 g = new get1(s);
        get2 g1 = new get2(s);
        Thread t1 = new Thread(g);
        Thread t2 = new Thread(g1);
        t1.start();
        t2.start();
    }
}
