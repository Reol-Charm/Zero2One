package cn.itcast.day09.myexpantation;
/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/20 9:45
 * @version:         1.0
 *
 */

import java.util.ArrayList;
import java.util.Random;

public class RandTest {
    public static void main(String[] args) {
        RandomSend s1 = new RandomSend("RandomSend", 300);
//        s1.send(30,3);
        ArrayList<Double> red01 = s1.send01(30, 3);
        Accepter01 a = new Accepter01("a", 0);
        Accepter01 a2 = new Accepter01("b", 0);
        Accepter01 a3 = new Accepter01("c", 0);

        a.openRed(red01);
        a2.openRed(red01);
        a3.openRed(red01);

        s1.show();
        a.show();
        a2.show();
        a3.show();
//        System.out.println("a.getBalance() = " + a.getBalance());
//        System.out.println("a2.getBalance() = " + a2.getBalance());
//        System.out.println("a3.getBalance() = " + a3.getBalance());
        System.out.println("AllBalance = " + (a.getBalance() + a2.getBalance() + a3.getBalance()));

//        Random r = new Random();
//        System.out.println(r.nextDouble());
    }
}
