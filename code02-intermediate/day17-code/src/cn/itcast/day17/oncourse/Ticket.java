package cn.itcast.day17.oncourse;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/7 14:45
 * @version: 1.0
 */

public class Ticket implements Runnable {

    private int ticket = 10;
    Object lock = new Object();

    @Override
    public void run() {

        /*1. 同步代码块*/
//        java.lang.NullPointerException
//        synchronized (lock) {

        /*窗口一直开启*/
        while (true) {
            /*同步代码块*/
//            new Object() 锁看起来不起作用
            synchronized (lock/*new Object()*/) {
                /*有票卖的话*/
                if (ticket > 0) {
                    /*出票等待, 增加线程安全问题出现的几率*/
                    try {
                        Thread.sleep(600);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    /*发票*/
                    System.out.println(Thread.currentThread().getName()
                            + "正在卖第" + ticket-- + "张票");
                    /*terminal program*/
                } else {
                    return;
                }
            }
        }
    }
}
