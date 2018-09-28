package cn.itcast.day16.exception.homework;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/6 21:18
 * @version: 1.0
 */

import java.util.Date;

/**
 * Describe:
 * 创建三个子线程，
 * 在每个线程中开启10万次的循环
 * 线程1循环中将循环自增变量i赋值给Integer类型变量
 * 线程2循环中将字符串"黑马程序员"赋值给String类型变量b
 * 线程3循环中将字符串"黑马程序员"和循环自增变量i拼接后赋值给String类型变量c
 * 分别计算三个线程完成任务所用的毫秒值
 * Project Name: IdeaProject
 * Package Name: com.itcast.cn.test05
 * Class Name: Practice11
 * User Name: 陈佳忠
 * Date: 2018/8/6 20:07
 */

public class Test {
    public static void main(String[] args) {
        Thread x = new Thread() {
            @Override
            public void run() {
                Date date1 = new Date();
                long time1 = date1.getTime();
                Integer n;
                for (int i = 0; i < 100000; i++) {
                    n = i;
                }
                Date date2 = new Date();
                long time2 = date2.getTime();
                System.out.println(time2 - time1);
            }
        };
        Thread y = new Thread() {
            @Override
            public void run() {
                Date date3 = new Date();
                long time3 = date3.getTime();
                String b;
                for (int i = 0; i < 100000; i++) {
                    b = "黑马程序员";
                }
                Date date4 = new Date();
                long time4 = date4.getTime();
                System.out.println(time4 - time3);
            }
        };
        Thread z = new Thread() {
            @Override
            public void run() {
                Date date5 = new Date();
                long time5 = date5.getTime();
                String c;
                for (int i = 0; i < 100000; i++) {
                    c = "黑马程序员" + i;
                }
                Date date6 = new Date();
                long time6 = date6.getTime();
                System.out.println(time6 - time5);
            }
        };
        x.start();

        y.start();

        z.start();
    }
}

