package cn.itcast.day16.exception.oncourse;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/6 17:09
 * @version: 1.0
 */

public class MyFirstThread extends Thread {
    public static void main(String[] args) {
        /*类名称非常重要, 要做到见名知意. */
//        String substring(int beginIndex)
        try {
            String s = "hello";
            String sub = s.substring(0);
//            String sub1 = s.substring(1);
//            String sub = s.substring(0,1);
            System.out.println(sub);
            s = null;
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        }
        // /*多 catch 的原则
        // 只有一个会被处理. */
        try {
            int[] arr = new int[10];
            System.out.println(arr[10]);
            arr = null;
            System.out.println(arr[0]);
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("数组角标越界");
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        }
        /*NumberFormatException*/
//        System.out.println(Integer.parseInt("itcast"));

        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
        try {
            Date date = format.parse("2018-04-03");
            System.out.println("程序正常");

        } catch (ParseException e) {
            System.out.println("程序异常");
        }


    }

    /**
     * 重写父类方法中 run() 方法, 设置线程任务(多出来的线程究竟干什么.)
     */


    public MyFirstThread() {
    }

    public MyFirstThread(String name) {
        //把线程名称传递给父类,让父类(Thread)给子线程起一个名字
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print("线程i = " + i + "\t");
            try {
                /*秒表效果*/
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        /*setName() 方法1*/
        setName("Gouge");
        /*当前线程的名字*/
        System.out.println("MyFirstThread.currentThread().getName() = " + Thread.currentThread().getName());
    }
}
