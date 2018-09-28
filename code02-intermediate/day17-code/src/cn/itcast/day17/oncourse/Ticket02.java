package cn.itcast.day17.oncourse;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/7 15:26
 * @version: 1.0
 */

public class Ticket02 implements Runnable {

    private static int TICKET = 10;
    Object lock = new Object();

    @Override
    public void run() {
        System.out.println(this);
        while (true) {
            sellTicket02();
        }
    }


    /*2.1 同步方法:
     * 修饰符 synchronized 返回值类型 参数列表(){}*/
    public /*synchronized*/ void sellTicket() {
        /*验证 同步锁 对象是 谁
         * 锁对象就是 this
         * 就是实现类对象new Ticket02()
         * 地址值相同*/
        synchronized (this) {

            if (TICKET > 0) {
                /*出票等待, 增加线程安全问题出现的几率*/
                try {
                    Thread.sleep(600);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()
                        + "正在卖第" + TICKET-- + "张票");
            }
        }
    }

    /*2.2 静态同步方法*/
    public static /*synchronized*/ void sellTicket02() {
        /*验证 同步锁 对象是 谁?
         * 我们使用当前方法所在类的字节码对象(类名.class)
         */
        synchronized (Ticket02.class) {

            if (TICKET > 0) {
                /*出票等待, 增加线程安全问题出现的几率*/
                try {
                    Thread.sleep(600);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()
                        + "正在卖第" + TICKET-- + "张票");
            }
        }
    }
}