package cn.itcast.day18.homework.practice09;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/10 9:38
 * @version: 1.0
 *//*1.定义一个Fruit水果类
		成员变量：stock库存
		构造方法、set和get
	2.定义一个官网线程类：NetShop02，实现Runnable接口
		完成卖出水果的动作
	3.定义一个实体店线程类：FrontShop，实现Runnable接口
		完成卖出水果的动作
	4.使用等待唤醒机制完成卖出100份坚果的功能
		例如：
			官网正在卖出第1份，还剩余99份
			实体店正在卖出第2份，还剩余98份
			官网正在卖出第3份，还剩余97份
			实体店正在卖出第4份，还剩余96份
			...*/

public class Fruit {
    private int stock;
    /*定义计数器*/
    private int count = 0;
    /*建立线程通信的判断*/
    private boolean flag = false;

    public Fruit() {
    }

    public Fruit(int stock) {
        this.stock = stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public int getStock() {
        return stock;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
