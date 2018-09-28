package cn.itcast.day18.homework.practice09;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/10 10:00 - 04
 * @version: 1.0
 */

public class Test {
    public static void main(String[] args) {
        Fruit fruit = new Fruit(100);
        NetShop netShop = new NetShop(fruit);
        FrontShop frontShop = new FrontShop(fruit);
        new Thread(netShop, "官网").start();
        new Thread(frontShop, "实体店").start();
    }

}
