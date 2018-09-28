package cn.itcast.day18.homework.OptimizPrac09;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/10 9:39 -46(comments) - 54
 * @version: 1.0
 */
/*4.使用等待唤醒机制完成卖出100份坚果的功能
		例如：
			官网正在卖出第1份，还剩余99份
			实体店正在卖出第2份，还剩余98份
			官网正在卖出第3份，还剩余97份
			实体店正在卖出第4份，还剩余96份*/
/*思路:
 * 1. 判断是否已经卖出了一份, 是的话, 切换线程.
 * 2. 为 false 时, 官网进入等待, 等待实体店售卖(线程跳到实体店执行.).
 * 3. 卖出第一份, 定义 全局变量 num 为100, goods--;
 * 4. 定义计数器, 记录第几份.
 * 5. 卖出一份后, 唤醒实体店, 让其开始销售.*/
/*交替打印*/
public class NetShop implements Runnable {
    /*连接Fruit*/
    private Fruit fruit;
    /*获取库存*/
//    private int stock = fruit.getStock();
//    private int count = fruit.getCount();

    //    NullPointerException
    public NetShop(Fruit fruit) {
        this.fruit = fruit;
    }

    @Override
    public void run() {
        /*一直卖, 直到卖完;*/
        while (true) {
            /*不同线程进入,保证同一操作. */
            synchronized (fruit) {
                /*1. 间隔出售*/
                if (fruit.isFlag()) {
                    try {
                        fruit.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                /*库存减少*/
//                stock--;
                fruit.setStock(fruit.getStock() - 1);
                /*计数器增加*/
//                count++;
                fruit.setCount(fruit.getCount() + 1);
                /*2. 开始出售, 总量减一*/
                System.out.println(Thread.currentThread().getName() + "正在卖出第"
                        + /*(++count)*/(fruit.getCount())
                        + "份，还剩余" + fruit.getStock() + "份");
                /*库存小于1,跳出*/
                if (fruit.getStock() < 1) {
                    break;
                }

                /*3. 卖出了, 对一开始的判断进行修改.*/
                fruit.setFlag(true);
                /*4. 唤醒实体店线程.*/
                fruit.notify();

                /*结束进程. */
                /*if (stock == 0) {
                    System.out.println("当前库存为: "
                            + stock + "感谢关注, 敬请期待下一期.");
                    System.exit(stock);
                }*/
            }
        }
    }
}
