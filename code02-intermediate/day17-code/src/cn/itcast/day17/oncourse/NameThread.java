package cn.itcast.day17.oncourse;

import cn.itcast.day16.exception.oncourse.MyFirstThread;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/7 9:47
 * @version: 1.0
 */

public class NameThread extends Thread {
    /*设置"主线程"名字*/
    public NameThread(String name) {
        super(name);
    }

    public static void main(String[] args) {
        MyFirstThread th = new MyFirstThread();
        /*getName()*/
        String name = th.getName();
        System.out.println("name = " + name);
        System.out.println("Thread-1 = " + new MyFirstThread().getName());
//        "main"线程
        System.out.println(Thread.currentThread().getName());
        /*将 NameThread 类继承 Thread, 从而设置新的线程名称*/
//        主线程 = Thread[主线程,5,main]
        System.out.println("主线程 = " +  new NameThread("主线程"));

        /*开启多线程*/
        th.start();
        /*setName() 方法2*/
        MyFirstThread th1 = new MyFirstThread("Hapi");
        System.out.println("th1.getName() = " + th1.getName());
    }
}
