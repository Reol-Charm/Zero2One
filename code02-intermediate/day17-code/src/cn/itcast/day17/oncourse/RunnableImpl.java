package cn.itcast.day17.oncourse;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/7 11:08
 * @version: 1.0
 */

public class RunnableImpl implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("ri" + Thread.currentThread().getName() + "-->" + i);
        }
    }
}
