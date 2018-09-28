package cn.itcast.day17.oncourse.courescase;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/7 20:39 -21 : 15
 * @version: 1.0
 */
/*第二题：使用多线程解决以下问题
	有一个包包的数量为100个。分别从实体店和官网进行售卖！
	要求使用多线程的方式，分别打印实体店和官网卖出包包的信息！
	分别统计官网和实体店各卖出了多少个包包，例如：
	官网共卖出了45个
	实体店共卖出了55个*/
public class SellPackage {
    /* p = 100;
    实体店线程
    *       包包数量减一, 打印卖包,
    *实体店线程
    *       包包数量减一, 打印卖包, */
    public static void main(String[] args) {
//        PackageImpl sellp = new PackageImpl();
        PackageImpl02 sellp = new PackageImpl02();
//        Runnable sellp = sell();
//        for (int i = 0; i < 2; i++) {
//            Thread t = new Thread(sellp, "实体店" + i);
        Thread t = new Thread(sellp, "实体店");
        Thread t2 = new Thread(sellp, "网店");

        t.start();
        t2.start();
    }

    /*错误示范*/
    public static synchronized Runnable sell() {

        Runnable r = new Runnable() {
            int p = 100;
            /*还剩多少 p*/
            int sum = 0;
            int count = 0;

            @Override
            public void run() {
                /*store */
                while (p > 0) {
//                    synchronized (this) {
                    p--;
                    /*原本打算获取到 卖的包, 就是100 - p, 但忽略了, 本身就是 101 - p.*/
                    count = p;
                    System.out.println(Thread.currentThread().getName()
                            + "卖出第: " + (100 - count/*p*/) + "个.");
//                    }
                    sum++;
                }
                System.out.println(Thread.currentThread() + "卖出共: " + sum + "个.");
            }

            /*private synchronized void sellP() {
                p--;
                count = p;
                System.out.println(Thread.currentThread().getName()
                        + "共卖出: " + (100 - count));
            }*/
        };
        return r;

    }

}
