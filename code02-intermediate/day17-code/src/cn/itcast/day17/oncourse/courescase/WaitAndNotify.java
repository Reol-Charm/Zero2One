package cn.itcast.day17.oncourse.courescase;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/7 17:02 - 18: 37
 * @version: 1.0
 */

/**
 * 等待唤醒案例:线程之间的通信
 * 创建一个顾客线程(消费者):告知老板要的包子的种类和数量,调用wait方法,放弃cpu的执行,进入到WAITING状态(无限等待)
 * 创建一个老板线程(生产者):花了5秒做包子,做好包子之后,调用notify方法,唤醒顾客吃包子
 * <p>
 * 注意:
 * 顾客和老板线程必须使用同步代码块包裹起来,保证等待和唤醒只能有一个在执行
 * 同步使用的锁对象必须保证唯一
 * 只有锁对象才能调用wait和notify方法
 * <p>
 * Obejct类中的方法      无限等待状态
 * void wait()
 * 在其他线程调用此对象的 notify() 方法或 notifyAll() 方法前，导致当前线程等待。
 * void notify()
 * 唤醒在此对象监视器上等待的单个线程。
 * 会继续执行wait方法之后的代码
 */
public class WaitAndNotify {
    public static void main(String[] args) {
        Object lock = new Object();
        /*创建顾客线程, 点菜, 然后等待店家上菜*/
        new Thread(new Runnable() {
            @Override
            public void run() {
                /*同步代码块 和 Object 类*/
                synchronized (lock) {
                    /*点菜*/
                    System.out.println(Thread.currentThread().getName() + "-->老板, 香菇滑鸡饭");
                    try {
                        /*获取到锁对象，调用wait方法，进入waiting状态，释放锁对象. 点完菜, 进入等待*/
                        lock.wait();

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        /*线程被唤醒后, 上菜之后, 开吃*/
                        System.out.println(Thread.currentThread().getName() + "-->开吃");
                        return;
                    }

                }
            }
            /*public Thread(Runnable target, String name){}*/
        }, "顾客线程").start();

        /*创建店家线程, 做菜 5s 后, 唤醒顾客线程*/
        new Thread(new Runnable() {
            @Override
            public void run() {
                /*收到点单后, 进入做菜时间*/
                synchronized (lock) {

                    try {
                        /*wait 4.5s*/
                        for (int i = 1; i <= 3; i++) {
                            Thread.sleep(1500);
                            System.out.println(i + "s");
                        }
                        System.out.println(Thread.currentThread().getName() + ": 上菜成功, 顾客请吃.");
                        /*唤醒顾客, 顾客继续执行 wait() 之后的代码.*/
                        lock.notify();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "店家线程").start();
    }
}
