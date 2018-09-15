package cn.itcast.day09.practice_redpacket_afer_littletest;
/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/20 16:55
 * @version:         1.0
 *
 */

import java.util.ArrayList;
import java.util.Random;

public class Accepter extends Super {
    public Accepter() {

    }

    public Accepter(String name, double balance) {
        super(name, balance);
    }

    public void acceptRed(ArrayList<Double> theRed) {
//        if (theRed == null) {
//            System.out.println("请充值或者更换银行卡.");
//            return;
//        }
        int index = new Random().nextInt(theRed.size());

        double redmoney = theRed.remove(index);

//        double balanceAfterOpenRed = getBalance() + redmoney;     wrong!
        setBalance(getBalance() + redmoney);
    }
}
