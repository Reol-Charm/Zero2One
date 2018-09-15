package cn.itcast.day18.oncourse.lambdaexpression;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/10 0:30
 * @version: 1.0
 */

public class MyLambda {
    public static void main(String[] args) {
//        Object o = new Object();
//        IllegalMonitorStateException
        new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    Thread.sleep(500);
                    System.out.print(i + "s" + "\t");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
        }).start();
    }
}
