package cn.itcast.day09.practice_redpacket_afer_littletest;
/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/20 16:28 -16:55
 * @version:         1.0
 *
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Sender extends Super {
    public Sender() {
    }

    public Sender(String name, double balance) {
        super(name, balance);
    }

    public ArrayList<Double> sendRed(double money, double count) {
        ArrayList<Double> theRed = new ArrayList<>();

        if (getBalance() < money) {
            System.out.println("No enough balance!");
            return theRed;
        } else {
            double balanceAftersend = super.getBalance() - money;
        }

//        theRed.size() = count;        Wrong!
        for (int i = 0; i < count; i++) {
//            double index = new Random().nextInt(theRed.size());       wrong!
            if (i != count - 1) {
                double randomRed = new Random().nextDouble() * money;
                theRed.add(randomRed);
//                拿出了第一个红包, 发的红包内减去
                money -= randomRed;
//                最后一个红包
            } else {
                theRed.add(money);
            }
        }
        return theRed;
    }
}
