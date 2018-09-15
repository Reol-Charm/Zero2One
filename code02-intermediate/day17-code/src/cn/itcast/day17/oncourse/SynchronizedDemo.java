package cn.itcast.day17.oncourse;

/**
 * @Description: 同步代码块
 * @Author: Rekol
 * @CreateDate: 2018/8/7 14:44 - 15 : 20
 * @version: 1.0
 */

public class SynchronizedDemo {

    public static void main(String[] args) {
//        TicketLock t = new TicketLock();
        Ticket02 t = new Ticket02();
//        Ticket t = new Ticket();

        Thread t1 = new Thread(t, "windows01");
        Thread t2 = new Thread(t, "windows02");
        Thread t3 = new Thread(t, "windows03");
//windows03正在卖第0张票
//windows02正在卖第-1张票
        System.out.println(" t: " + t);
        t1.start();
        t2.start();
        t3.start();

    }
}
