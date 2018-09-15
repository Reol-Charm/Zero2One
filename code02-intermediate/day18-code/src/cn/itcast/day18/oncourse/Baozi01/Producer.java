package cn.itcast.day18.oncourse.Baozi01;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/9 16:33
 * @version: 1.0
 */
/*1. judge the good,判断包子的有无, 有则notify consumer;
 2. producer make goods,
 3. 包子做好了, 进入等待, 等待 consumer 吃完后的唤醒.*/
class Producer implements Runnable {
    /*获取对象锁*/
//    Goods gds = new Goods();

    private Goods gds;

    /*constructor, 将 锁对象 传递到同步中.*//*踩坑!*/
    public Producer(Goods gds) {
        this.gds = gds;
    }

    /*线程执行任务*/
    @Override
    public void run() {
        /*1. judge the good,判断包子的有无, 有则notify consumer;*/
        while (true) {
            synchronized (gds) {

                if (gds.isFlag() == true) {
                    /*判断包子的有无, 有则notify consumer;*/
                    try {
                        gds.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                /*等待生产500ms*/
                try {
                    gds.wait(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("包子做好了");

                /*包子做好了, 进入等待, 等待 consumer 吃完后的唤醒.*/
                gds.setFlag(true);
                gds.notify();
            }
        }

    }

}
