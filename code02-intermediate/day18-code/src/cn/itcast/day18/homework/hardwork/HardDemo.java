package cn.itcast.day18.homework.hardwork;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/10 21:06
 * @version: 1.0
 */

public class HardDemo {
    public static void main(String[] args) {
        Wares wares = new Wares(100);
        Producer producer01 = new Producer(wares);
        Producer02 producer02 = new Producer02(wares);
        Consumer consumer01 = new Consumer(wares);
        Consumer02 consumer02 = new Consumer02(wares);
        new Thread(producer01, "生产者 1 ").start();
        new Thread(producer02, "生产者 2 ").start();
        new Thread(consumer01, "消费者 1 ").start();
        new Thread(consumer02, "消费者 2 ").start();
    }
}
