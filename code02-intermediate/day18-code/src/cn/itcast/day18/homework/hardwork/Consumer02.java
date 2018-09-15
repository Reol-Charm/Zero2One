package cn.itcast.day18.homework.hardwork;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/10 21:06
 * @version: 1.0
 */

public class Consumer02 implements Runnable {
    private Wares gds;

    /*连接类与类*/
    public Consumer02(Wares gds) {
        this.gds = gds;
    }

    @Override
    public void run() {
        /*有无包子, 没有, 进入生产者线程, 生产*/
        if (!gds.isHave()) {
            int count = 0;
            synchronized (gds) {
                System.out.println(Thread.currentThread().getName()
                        + "消费包子" + ++count);
                /*将包子的状态设置成有早点了.*/
                gds.setHave(false);
                gds.notifyAll();
            }
            /*有包子, 进入等待状态*/
        } else {
            try {
                gds.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
