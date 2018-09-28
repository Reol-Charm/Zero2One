package cn.itcast.day18.homework.practice09;

/**
 * @Description: java类作用描述
 * @Author: hk
 * @CreateDate: 2018-08-10$ 15:38$
 * @Version: 1.0
 */

public class shop {
    private int count = 0;
    private boolean flag = false;
    private int sum = 100;

    public int getCount() {
        return count;
    }

    public void get1() throws InterruptedException {
        synchronized (this) {
            if (flag) {
                this.wait();
            }
            count++;
            sum--;
            System.out.println("官网卖了第" + count + "双鞋,还剩" + sum);
            this.notify();
            flag = !flag;
        }
    }

    public void get2() throws InterruptedException {
        synchronized (this) {
            if (!flag) {
                this.wait();
            }
            count++;
            sum--;
            System.out.println("实体店卖了第" + count + "双鞋,还剩" + sum);
            this.notify();
            flag = !flag;
        }
    }
}
