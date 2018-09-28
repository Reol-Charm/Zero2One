package cn.itcast.day18.oncourse.Baozi02;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/9 20:09 - 12;
 * @version: 1.0
 */

public class BreakfastDemo {
    public static void main(String[] args) {
        Goods01 goods01 = new Goods01();
        Consumer01 cs01 = new Consumer01(goods01);
        Producer01 pr01 = new Producer01(goods01);
        new Thread(cs01,"Consumer").start();
        new Thread(pr01,"Producer").start();
    }

}
