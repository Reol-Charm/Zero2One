package cn.itcast.day09.practice_redpacket_afer_littletest;
/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/20 17:03
 * @version:         1.0
 *
 */

import java.util.ArrayList;

public class RedTest {
    public static void main(String[] args) {
        Sender s = new Sender("Rekol", 300);
//        发红包
        ArrayList<Double> theRed = s.sendRed(560, 3);

//        if (theRed == null) {
//            System.out.println("请充值或者更换银行卡.");
//            return;
//        }

        Accepter a = new Accepter("a", 0);
        Accepter b = new Accepter("b", 0);
        Accepter c = new Accepter("c", 0);

        a.acceptRed(theRed);
        b.acceptRed(theRed);
        c.acceptRed(theRed);

        a.show();
        b.show();
        c.show();
        System.out.println("Allbalance= " + (a.getBalance() + b.getBalance() + c.getBalance()));

    }
}
