package cn.itcast.day16.exception.homework;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/6 20:55 - 21: 14
 * @version: 1.0
 */
/*问题：
创建三个子线程，在每个线程中开启10万次的循环，
线程1循环中将循环自增变量i赋值给Integer类型变量 a，
线程2循环中将字符串"黑马程序员"赋值给String类型变量b,
线程3循环中将字符串"黑马程序员"和循环自增变量i拼接后赋值给String类型变量c
分别计算三个线程完成任务所用的毫秒值
*/

public class Practice11 {
    public static void main(String[] args) {
        long timeMillis = System.currentTimeMillis();
        System.out.println("System.currentTimeMillis() = " + timeMillis);

        Thread th01 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000 * 100; i++) {
                    Integer a = i;
                }
                System.out.println("System.currentTimeMillis01() = " + (System.currentTimeMillis() - timeMillis));
                System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
            }
        };

        Thread th02 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000 * 100; i++) {
                    String b = "黑马程序员";
                }
                System.out.println("System.currentTimeMillis02() = " + (System.currentTimeMillis() - timeMillis));

                System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
            }
        };

        Thread th03 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000 * 100; i++) {
                    String c = "黑马程序员" + i;
                }
                System.out.println("System.currentTimeMillis03() = " + (System.currentTimeMillis() - timeMillis));

                System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
            }
        };

        th01.start();
        th02.start();
        th03.start();
        /*  System.currentTimeMillis() = 1533561347664
            System.currentTimeMillis02() = 139
            System.currentTimeMillis() = 1533561347804
            System.currentTimeMillis01() = 156
            System.currentTimeMillis() = 1533561347821
            System.currentTimeMillis03() = 227
            System.currentTimeMillis() = 1533561347892
        */
    }
}