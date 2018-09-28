package cn.itcast.day09.redpacketpractice;
/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/20 9:25
 * @version:         1.0
 *
 */

import java.util.ArrayList;
import java.util.Random;

public class Sender01 extends User01 {
    public Sender01() {
    }

    public Sender01(String name, double balance) {
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
// split the targetRed to every count of red packet.
        double redPacket = targetRed / count;
        for (int i = 0; ; i++) {
            double randRed = new Random().nextDouble() * targetRed;
            targetRed -= randRed;
            if (targetRed == 0) {
                break;
            }
        }


        double mod = targetRed % count;

        for (int i = 0; i < count; i++) {
            if (i == count - 1) {
                red01.add(redPacket + mod);
            } else {
                red01.add(redPacket);
            }
        }
        return red01;
    }
}
