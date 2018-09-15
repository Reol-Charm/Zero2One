package cn.itcast.day18.homework.practice09;

/**
 * @Description: java类作用描述
 * @Author: hk
 * @CreateDate: 2018-08-10$ 15:47$
 * @Version: 1.0
 */

public class get1 implements Runnable {
    private shop s;

    public get1(shop s) {
        this.s = s;
    }

    @Override
    public void run() {
        while (s.getCount() < 99) {
            try {
                s.get1();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
