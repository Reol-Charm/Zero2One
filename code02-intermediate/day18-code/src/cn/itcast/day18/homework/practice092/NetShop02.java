package cn.itcast.day18.homework.practice092;

import cn.itcast.day18.homework.practice09.Fruit;

/**
 * Describe:
 * 定义一个官网线程类：NetShop02，实现Runnable接口
 * 完成卖出水果的动作
 * Project Name: IdeaProject
 * Package Name: com.itcast.cn.test07
 * Class Name: NetShop02
 * User Name: 陈佳忠
 * Date: 2018/8/10 12:38
 */

public class NetShop02 implements Runnable {
    //成员变量
    Fruit fruit;
    @Override
    public void run() {
        //计数器
        int count = 0;
        while (true) {
            synchronized (fruit) {
                if (fruit.getStock() % 2 == 1) {
                    try {
                        fruit.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //stock库存小于则终止循环
                if (fruit.getStock() < 1) {
                    break;
                }
                fruit.setStock(fruit.getStock()-1);
                System.out.println(Thread.currentThread().getName() + "正在卖出第" +
                        ++count/*(count - fruit.getStock())*/ + "份,还剩余" + fruit.getStock());
                fruit.notify();
            }
        }
    }
}
