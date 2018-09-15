package cn.itcast.day18.homework.practice09;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/10 9:56
 * @version: 1.0
 */
/*使用等待唤醒机制完成卖出100份坚果的功能
		例如：
			官网正在卖出第1份，还剩余99份
			实体店正在卖出第2份，还剩余98份
			官网正在卖出第3份，还剩余97份
			实体店正在卖出第4份，还剩余96份*/
/*思路:
1. 判断 flag 为 true ? 是就进入等待, 让官网卖第一份.
* */
public class FrontShop implements Runnable {
    /*连接Fruit*/
    private final Fruit fruit;

    /*条件私有了, 下面的写法, 只会复原 stock 和 count*/
//    private int stock = fruit.getStock();
//    private int count = fruit.getCount();
    public FrontShop(Fruit fruit) {
        this.fruit = fruit;
    }

    @Override
    public void run() {
        /*一直卖, 直到卖完;*/
        while (/*fruit.getStock() <= 0*/true) {
            /*不同线程进入,保证同一操作. */
            synchronized (fruit) {
//              boolean b = count % 2 == 0;
                /*1. 线程通信*/
                if (!fruit.isFlag()) {
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
                        + /*(++count)*/fruit.getCount()
                        + "份，还剩余" + fruit.getStock() + "份");
                /*库存小于1,跳出*/
                if (fruit.getStock() < 1) {
                    break;
                }
                /*3. 卖出了, 修改判断, 又卖出一份了, 唤醒网店店线程.*/
                fruit.setFlag(/*true*/false);
                fruit.notify();
            }
        }
    }
}



