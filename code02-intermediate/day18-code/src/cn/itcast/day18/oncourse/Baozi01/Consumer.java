package cn.itcast.day18.oncourse.Baozi01;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/9 16:50
 * @version: 1.0
 */
/*1. 没有包子了, 等待生产
 * 2. 有,开吃, 吃完, 吃完唤醒生产*/
public class Consumer implements Runnable {
//    Goods gds = new Goods();

    private Goods gds;

    /*generate constructor*/
    public Consumer(Goods gds/*, Object name*/) {
//        super(name);
        this.gds = gds;
    }

    @Override
    public void run() {
        while (true) {
            /*必须同时同步技术保证两个线程只能有一个在执行*/
            synchronized (gds) {

                /*判断包子的有无, 没有则进入 waiting 状态, 等待生产者生产包子*/
                if (gds.isFlag() == false) {
//            gds.notify();
                    /*没有包子, 不能吃, 只能等待生产.*/
                    try {
                        gds.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("有包子, 开吃");
                /*吃完包子了. 唤醒 生产者 继续生产*/
                gds.setFlag(false);

                System.out.println("吃完包子了.");
                System.out.println("---------------------");

                gds.notify();
            }
        }
    }
}
