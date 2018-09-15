package cn.itcast.day18.homework.OptimizPrac09;


/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/10 10:00 - 04
 * @version: 1.0
 */

public class OptmizDemo {
    public static void main(String[] args) {
        Fruit fruit = new Fruit(100);
        new Thread(new NetShop(fruit), "官网").start();
        new Thread(new FrontShop(fruit), "实体店").start();
    }

}
