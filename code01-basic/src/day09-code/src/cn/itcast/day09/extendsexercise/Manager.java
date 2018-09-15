package cn.itcast.day09.extendsexercise;/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/19 19:55
 * @version:         1.0
 *
 */

import java.util.ArrayList;

public class Manager extends User {
    public Manager() {
    }

    public Manager(String username, double leftMoney) {
        super(username, leftMoney);
    }

    public ArrayList<Double> send(int money, int count) {
        //get or store the balance.

        double leftMoney = getMoney();

        if (money > leftMoney) {
            return null;
        }
        //扣钱
        super.setMoney(leftMoney - money);

        ArrayList<Double> list = new ArrayList<>();
//扩大一百倍, 折算成"分" 单位.
        money *= 100;

        int m = money / count;
//        不能整除的红包余数.
        int gelta = money % count;
//将等额的前面几个红包分别放到集合中
        for (int i = 0; i < count - 1; i++) {
            list.add(m / 100.0);
        }
//        处理最后一份红包
        if (gelta == 0) {
            list.add(m / 100.0);
        } else {
//            不能整除, 最后一份红包是每份 + 余数
            list.add((m + gelta) / 100.0);
        }

        return list;
    }
}
