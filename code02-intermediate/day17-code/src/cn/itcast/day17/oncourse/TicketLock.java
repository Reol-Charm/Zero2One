package cn.itcast.day17.oncourse;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/7 15:59
 * @version: 1.0
 */
/*3. 锁机制
 Lock lock = new ReentrantLock();
*/
/*public void lock() :加同步锁。*/
/*public void lock() :释放同步锁。*/

public class TicketLock implements Runnable {
    private int ticket = 10;
    /**
     * java.util.concurrent.locks.Lock
     */
    Lock lock = new ReentrantLock();

    public void run01() {
        while (true) {
            /*public void lock() :加同步锁。*/
            lock.lock();
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
            /*public void lock() :释放同步锁。*/
            lock.unlock();
        }
    }

    @Override
    public void run() {
        while (true) {
            /*public void lock() :加同步锁。*/
            lock.lock();
            /*有票卖的话*/
            if (ticket > 0) {
                /*出票等待, 增加线程安全问题出现的几率*/
                try {
                    Thread.sleep(600);
                    /*发票*/
                    System.out.println(Thread.currentThread().getName()
                            + "正在卖第" + ticket-- + "张票");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {

                    /*public void lock() :释放同步锁。*/
                    lock.unlock();
                }
            }
        }
    }
}
