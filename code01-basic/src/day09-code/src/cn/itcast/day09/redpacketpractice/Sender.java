package cn.itcast.day09.redpacketpractice;
/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/19 20:58
 * @version:         1.0
 *
 */

import java.util.ArrayList;

public class Sender extends User01 {
    public Sender() {
    }

    public Sender(String name, double balance) {
        super(name, balance);
    }

    public ArrayList<Double> send(int targetMoney, int count) {
//        definite a variable to store ever array of red packet number.
        ArrayList<Double> AllInOne = new ArrayList<>();

        //        get the balance;
        double balance = super.getBalance();
        if (balance < targetMoney) {
            System.out.println("You don't have enough money.");
            return AllInOne;
        }

//        decrease the begins' of balance.
        super.setBalance(balance - targetMoney);
//        split the red packet to three average
        double avg = targetMoney / count;

        double mod = targetMoney % count;

        for (int i = 0; i < (count - 1); i++) {
            AllInOne.add(avg);
        }

        double last = avg + mod;
        AllInOne.add(last);

        return AllInOne;


    }


}
