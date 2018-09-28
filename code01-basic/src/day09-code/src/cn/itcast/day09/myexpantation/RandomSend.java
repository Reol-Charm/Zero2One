package cn.itcast.day09.myexpantation;
/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/20 10:31
 * @version:         1.0
 *
 */

import java.util.ArrayList;
import java.util.Random;

public class RandomSend extends User01 {

    public RandomSend() {
    }

    public RandomSend(String name, double balance) {
        super(name, balance);
    }

    public ArrayList<Double> send01(double targetRed, double count) {
// declare an ArrayList to store every red packets.
        ArrayList<Double> red01 = new ArrayList<>();
// judge the balance and then subtract a red packets's number.
        double balance = super.getBalance();
        if (targetRed > balance) {
            System.out.println("don't enough balance");
            return red01;
        }
        setBalance(balance - targetRed);

// CASE 1: split the targetRed to every count of red packet.
//        double redPacket = targetRed / count;
//        double mod = targetRed % count;
//CASE 2: Random red packet.
//        for (int i = 0; ; i++) {
        for (int j = 0; j < count; j++) {
//            随机每个红包的金额
            if (j != count - 1) {
            double randRed = new Random().nextDouble() * targetRed;
//            最后一个红包
//            if (j == count - 1) {
//                red01.add(randRed + targetRed);
//            } else {

                red01.add(randRed);
//            }
//            总红包金额减去所有随机金额
                targetRed -= randRed;

            } else {
//                最后一个直接就是所剩.
                red01.add(targetRed);
            }
        }
        return red01;
            /*for (int j = 0; j < count; j++) {
                if (j == count - 1) {
                    red01.add(randRed + mod);
                } else {
                    red01.add(randRed);
                }
            }*/

//            for (int j = 0; j < count; j++) {
//            }
//
//            if (targetRed < 0) {
//                break;
//            }
//    }
    }
}



