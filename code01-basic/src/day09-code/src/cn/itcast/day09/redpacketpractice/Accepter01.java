package cn.itcast.day09.redpacketpractice;
/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/20 9:40
 * @version:         1.0
 *
 */

import java.util.ArrayList;
import java.util.Random;

public class Accepter01 extends User01 {
    public Accepter01() {
    }

    public Accepter01(String name, double balance) {
        super(name, balance);
    }

    public void openRed(ArrayList<Double> red01) {
//  index to remove;
        int index = new Random().nextInt(red01.size());

        double redAfterOpen = red01.remove(index);

        setBalance(getBalance() + redAfterOpen);
    }
}
