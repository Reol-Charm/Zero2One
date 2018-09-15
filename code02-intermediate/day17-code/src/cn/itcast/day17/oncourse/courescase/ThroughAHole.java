package cn.itcast.day17.oncourse.courescase;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/7 18:51 - 19:11 - 19:25 - 19:30 - 20:30
 * @version: 1.0
 */

/**
 * 请按要求编写多线程应用程序，模拟多个人通过一个山洞：
 * 1.这个山洞每次只能通过一个人，每个人通过山洞的时间为5秒；
 * 2.随机生成10个人，同时准备过此山洞，并且定义一个变量用于记录通过隧道的人数。
 * 显示每次通过山洞人的姓名，和通过顺序；
 */
/*
 * 1. 生成 10 个线程
 * 2. 每个线程在执行完后结束线程.
 * 3. 每个线程设置名字和*/
public class ThroughAHole {
    public static void main(String[] args) {
        /*获得 线程*/
        Runnable r = througHole();

        for (int i = 0; i < 10; i++) {
            /*多个线程 共享一个资源*/
            Thread th = new Thread(r, i + "人名" + ": ");
            th.start();
        }
        /*througHole(lock, "1");
        througHole(lock, "2");
        througHole(lock, "3");
        througHole(lock, "4");
        througHole(lock, "5");*/
    }

    public static synchronized Runnable througHole() {
        Runnable r = new Runnable() {
            int COUNT = 0;

            @Override
            public void run() {
                throughHole();
            }

            /* 同步方法*/
            private synchronized void throughHole() {
                System.out.println(Thread.currentThread().getName() + "正在通过洞穴");

                try {
                    /*通过 5s*/
                    for (int i = 1; i < 6; i++) {
                        Thread.sleep(500);
                        System.out.println(i + "s");
                    }
//                        lock.wait();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                /*通过洞穴, 人数+*/
                COUNT++;
                System.out.println("我是通过洞穴的第 " + COUNT + " 人");
            }
        };
        return r;
//        hole(lock, name);
    }


//    private static void hole(Object lock, String name) {
//
//        Runnable r02 = new Runnable() {
//
//
//            @Override
//            public void run() {
//                synchronized (lock) {
//                    try {
//                        /*通过 5s*/
//                        for (int i = 1; i < 6; i++) {
//
//                            Thread.sleep(1000);
//                            System.out.println(i + "s");
//                        }
//
//                        /*唤醒对应的*/
////                        lock.notify();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        };
//        Thread th02 = new Thread(r02, name);
//        th02.start();
//    }


}
