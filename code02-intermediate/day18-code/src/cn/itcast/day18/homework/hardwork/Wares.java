package cn.itcast.day18.homework.hardwork;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/10 20:55
 * @version: 1.0
 */
/* 1. 两个生产者生产包子
 *  2. 两个消费者消费包子
 *  3. 四个线程, 两个生产者公用一个资源生产包子
 *  4. 两个消费者 共用一个资源消费包子.
 *  5. //感觉//有两把锁, 分别锁住双方中的另一个.*/

public class Wares {
    /*限定包子数量*/
    private Integer num;
    /*对是否有包子进行判断, 有就将锁交给消费者, 否则生产包子*/
    private boolean have = false;

    public Wares(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public boolean isHave() {
        return have;
    }

    public void setHave(boolean have) {
        this.have = have;
    }
}
