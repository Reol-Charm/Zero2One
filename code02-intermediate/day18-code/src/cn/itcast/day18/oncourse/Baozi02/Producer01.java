package cn.itcast.day18.oncourse.Baozi02;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/9 19:24 - 19 : 53
 * @version: 1.0
 */
/*1. 包子铺线程: 首先判断是否有包子, 已经有包子了, 就不生产包子,
                进入 waiting 状态, 等待顾客吃包子
  2.没有包子了, 开始生产.
  3.利用索引不同, 生产两种不同的包子. i % 2 == 0, i++ , else 另一种包子.
  4.生产完毕, 唤醒顾客吃包子.
                */

class Producer01 implements Runnable {
    private Goods01 gds01;

    /*将 锁对象 goods01 传入, 避免空指针异常问题. */
    public Producer01(Goods01 gds01) {
        this.gds01 = gds01;
//        @49e4cb85
        System.out.println("gds01 = " + gds01);
    }

    @Override
    public void run() {

        int i = 0;
        /*一直生产包子*/
        while (true) {
            /*同步代码块, 让线程安全执行, /*锁对象就是 this*/
//            synchronized (this) {//@1b965023
            synchronized (gds01) {
                /*验证*/
//                System.out.println("this = " + this);//@1b965023
                /*判断是否有包子, 有则等待顾客吃包子*/
                if (gds01.isFlag() == true) {
                    try {
                        gds01.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                /*没有包子, 则开始做包子*/
                System.out.println("开始做包子");
                /*利用 i 判断, 生产不同的包子, 为让索引不同, i++*/
                if (i++ % 3 == 0) {
                    gds01.setOuter("bread");
                    gds01.setInner("beef");

                } else if (i % 3 == 1) {
                    gds01.setOuter("eggCake");
                    gds01.setInner("bee");
                } else {
                    gds01.setOuter("Hello");
                    gds01.setInner(" World.");
                }
                System.out.println("正在生产: " + gds01.getOuter() + gds01.getInner() + "的早点.");
                /*做 500ms 的早点*/
                try {
                    for (int i1 = 0; i1 < 5; i1++) {
                        System.out.print(i1 + "s" + "\t");
                        gds01.wait(100);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println();
                /*做完早点后, 将早点标记为做好了, 并唤醒顾客吃早点.*/
                gds01.setFlag(true);
                System.out.println("早点做好了, 请吃.");
                gds01.notify();
            }
        }
    }
}
