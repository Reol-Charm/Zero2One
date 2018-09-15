package cn.itcast.day16.exception.oncourse;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/6 17:01 - 19:32
 * @version: 1.0
 */
/*1. 创建一个 Thread 类的子类 ThreadDemo;
 * 2. 在 Thread 类的子类中重写 Thread 类中的方法 run(), 设置线程任务(开启线程, 并告诉 JVM 线程做什么.);
 * 3. 创建 Thread 类的子类对象(ThreadDemo);
 * 4. 调用 Thread 类中已有方法 start(), 开启新的线程, 让 JVM 调用该线程的 run() 方法.
 *
 * 两个线程并发地运行.(在一段时间内, 多个线程运行.)*/

public class ThreadDemo {
    public static void main(String[] args) {
        Thread thread = new MyFirstThread();
        thread.start();
        /*Java 是 抢占式调度, 优先级, 同优先级就随机.*/
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程i = " + i);
        }
        /*同一进程只能被调用一次. IllegalThreadStateException*/
//        thread.start();

        System.out.println("-----------------------");

        /*通过内部类的方式调用新线程: */
        ThreadDemo.InnerThread th2 = new ThreadDemo().new InnerThread();
        th2.start();
        System.out.println("main()" + "-------------------------");

        /*anonymous inner class*/
        Thread th3 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("th3 i = " + i);
                }
            }
        };
        th3.start();

        /*new Thread()*/
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("th3 i = " + i);
                }
            }
        }.start();
    }

    class InnerThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("SecondThread i = " + i);
            }
        }
    }
}
