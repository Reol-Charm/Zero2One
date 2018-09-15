package cn.itcast.day18.oncourse.Baozi02;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/9 19:55 - 09
 * @version: 1.0
 */
/*消费者线程逻辑:
 * 1. 判断是否有早点, 没有就等待生产
 * 2. 有则吃早点, 吃完后, 将早点标记为没有, 并唤醒生产者继续生产早点.*/

public class Consumer01 implements Runnable {
    /*获取早点对象, 作为 锁对象.*/
    private Goods01 gds01;
    /*生成 constructor, 连接实现类与 早点类*/

    public Consumer01(Goods01 gds01) {
        this.gds01 = gds01;
    }

    @Override
    public void run() {
        /*一直进行吃早点的动作*/
        while (true) {
            /*同步操作, 实现安全多线程*/
            synchronized (gds01) {
                /*判断是否有 早点? 没有, 则等待生产*/
                if (gds01.isFlag() == false) {
                    try {
                        gds01.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                /*consumer begin eat breakfast.*/
                System.out.println("顾客开始吃早点");
                for (int i = 0; i < 3; i++) {
                    try {
                        System.out.print(i * 100 + "s" + "\t");
                        gds01.wait(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println();
                /*finish breakfast and flag the boolean, then notify the producer to make again.*/
                gds01.setFlag(false);
                System.out.println("consumer ask for new round of breakfast");
                gds01.notify();
                System.out.println("---------------------------------------");
            }
        }
    }
}
