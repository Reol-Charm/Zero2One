package cn.itcast.day18.homework.practice092;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/10 18:45
 * @version: 1.0
 */

public class ShopUnderLine implements Runnable {
    private Goods gds;

    public ShopUnderLine(Goods gds) {
        this.gds = gds;
    }

    @Override
    public void run() {
        while (gds.getStock() < 1) {
            int count = 0;
            synchronized (gds) {
                if (count % 2 == 1) {
                    try {
                        gds.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                gds.setStock(gds.getStock() - 1);
                count++;
                System.out.println(Thread.currentThread().getName() + "正在卖出第"
                        + (count) + "份，还剩余" + gds.getStock() + "份");
                gds.notify();
            }
        }
    }
}
