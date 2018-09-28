package cn.itcast.day09.redpacketpractice;
/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/20 9:45
 * @version:         1.0
 *
 */

import java.util.ArrayList;
import java.util.Random;

public class Test01 {
    public static void main(String[] args) {
        Sender s1 = new Sender("RandomSend", 300);
//        s1.send(30,3);
        ArrayList<Double> red01 = s1.send(30, 3);
        Accepter01 a = new Accepter01("a", 20);
        Accepter01 a2 = new Accepter01("b", 30);
        Accepter01 a3 = new Accepter01("c", 'a');
        a.openRed(red01);
        a2.openRed(red01);
        a3.openRed(red01);
        s1.show();
        a.show();
        a2.show();
        a3.show();

        Random r = new Random();
        System.out.println(r.nextDouble());
    }
}
