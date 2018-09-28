package cn.itcast.day17.oncourse.courescase;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/7 21:26 - 00:35 - 44
 * @version: 1.0
 */
/*第二题：使用多线程解决以下问题
	有一个包包的数量为100个。分别从实体店和官网进行售卖！
	要求使用多线程的方式，分别打印实体店和官网卖出包包的信息！
	分别统计官网和实体店各卖出了多少个包包，
	例如：
	官网共卖出了45个
	实体店共卖出了55个*/

/* 理解:
两个线程各开辟栈空间( run() 方法运行了两次), 都执行了 run() 方法(代码只写了一次) */

public class PackageImpl implements Runnable {
    /*100 个包*/
    private int p = 100;

    //    Wrong !!!     最大的错误. 搞得每次都是创建新的计数器.
//    /*共卖了多少个 p*/
//    int count = 0;
    @Override
    public void run() {
//        sell();

        /*计数器: 共卖了多少个 p*/
        int count = 0;
        while (true) {
            /*同步代码块, 两个线程到此处, 一个Runnable, 另一个 Blocked等待返回锁对象*/
            synchronized (this) {
                /*少于一个就跳出.没有第 0 个的说法, 最小为 1.*/
                if (p < 1) {
                    break;
                }
                /*买本子了, 卖出第 (101 - 100) 个*/
                System.out.println(Thread.currentThread().getName()
                        + "卖出第: " + (101 - p) + "个.");
                /*卖一个少一个*/
                p--;
                /*统计总共卖了多少个, 直接放在最后面就行了*/
                count++;
            }
        }
        System.out.println(Thread.currentThread().getName()
                + "共卖出" + count + "个");
    }


//  错误的同步方法.
    public synchronized void sell() {
        int count = 0;
//  实体店共卖出100个
//  网店共卖出0个
        while (true) {
            /*同步代码块, 两个线程到此处, 一个Runnable, 另一个 Blocked等待返回锁对象*/
                /*少于一个就跳出.没有第 0 个的说法, 最小为 1.*/
                if (p < 1) {
                    break;
                }
                /*买本子了, 卖出第 (101 - 100) 个*/
                System.out.println(Thread.currentThread().getName()
                        + "卖出第: " + (101 - p) + "个.");
                /*卖一个少一个*/
                p--;
                /*统计总共卖了多少个, 直接放在最后面就行了*/
                count++;

        }
        System.out.println(Thread.currentThread().getName()
                + "共卖出" + count + "个");
    }
}
