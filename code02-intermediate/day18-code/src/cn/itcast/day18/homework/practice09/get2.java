package cn.itcast.day18.homework.practice09;

/**
 * @Description: java类作用描述
 * @Author: hk
 * @CreateDate: 2018-08-10$ 15:48$
 * @Version: 1.0
 */

public class get2 implements Runnable {
    private shop s;

    public get2(shop s) {
        this.s = s;
    }

    @Override
    public void run() {
        while (s.getCount() < 99) {
            try {
                s.get2();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
