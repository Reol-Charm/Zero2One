package cn.itcast.day17.oncourse;

/**
 * @Description: 匿名线程三种方式
 * @Author: Rekol
 * @CreateDate: 2018/8/7 11:10
 * @version: 1.0
 */

public class RunnableDemo {
    public static void main(String[] args) {
        RunnableImpl r = new RunnableImpl();
        new Thread(r).start();
/**/
        new Thread(new RunnableImpl() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "==" + i);
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "==" + i);
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "==" + i);
            }
        }).start();
    }

}
