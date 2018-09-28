package cn.itcast.day17.oncourse.courescase;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/9 10:52
 * @version: 1.0
 */

public class PackageImpl02 implements Runnable{

    //在类中创建一个成员变量bagnum的数量为100
    private int bagnum = 100;
    //在类中声明一个变量作为成员变量-》锁对象
    private Object o = new Object();
    //在类中声明一个int型的成员变量并初始化为0,用来作为计数器
    private int i = 0;
    //在类中声明一个int型的成员变量并初始化为0,用来作为计数器
    private int j = 0;

    //重写run方法
    @Override
    public void run() {
        //死循环
        while (true) {
            //模拟出票时间
            //使用try..catch尝试自己解决抛出的问题
            try {
                //延时5ms
                Thread.sleep(1);
                //捕捉问题
            } catch (InterruptedException e) {
                //打印问题
                e.printStackTrace();
            }
            //同步代码块
            synchronized (o) {
                //判断如果当前进程的名称为“官网”则进入if语句体
                if ("官网".equals(Thread.currentThread().getName())) {
                    //判断当前bagnum是否小于1，是则进入循环体
                    //PS：该语句的作用是防止出现进程获取对象锁的时候，bagnum为0时出现多循环一次的现象
                    if (bagnum < 1) {
                        //终止循环
                        break;
                    }
                    //包包数减一
                    bagnum--;
                    //当前进程执行次数加一
                    i++;
                }
                //判断如果当前进程的名称为“实体店”则进入if语句体
                if ("实体店".equals(Thread.currentThread().getName())) {
                    //判断当前bagnum是否小于1，是则进入循环体
                    //PS：该语句的作用是防止出现进程获取对象锁的时候，bagnum为0时出现多循环一次的现象
                    if (bagnum < 1) {
                        //终止循环
                        break;
                    }
                    //包包数减一
                    bagnum--;
                    //当前进程执行次数加一
                    j++;
                }
            }
        }
        //判断如果当前进程的名称为“官网”则进入if语句体
        if ("官网".equals(Thread.currentThread().getName())) {
            //输出“官网”共卖了多少包包
            System.out.println(Thread.currentThread().getName() + i);
        }
        //判断如果当前进程的名称为“实体店”则进入if语句体
        if ("实体店".equals(Thread.currentThread().getName())) {
            //输出“实体店”共卖了多少包包
            System.out.println(Thread.currentThread().getName() + j);
        }
    }

}
