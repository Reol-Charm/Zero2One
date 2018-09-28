package cn.itcast.day18.homework.practice08;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/10 11:32
 * @version: 1.0
 */

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        while (true) {

            synchronized (this) {

                System.out.println("我需要一个老师");
                for (int i = 1; i < 3; i++) {
                    try {
                        Thread.sleep(1000);
                        System.out.print(i + "s" + "\t");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println();
                System.out.println("老师来了: " + Thread.currentThread().getName());
                System.out.println("教我java,教完后，老师回到了办公室");

            }
            System.out.println("-------------------------");
        }

    }
}
