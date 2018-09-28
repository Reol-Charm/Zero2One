package cn.itcast.day09.extendsexercise;/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/19 20:28
 * @version:         1.0
 *
 */

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member() {
    }

    public Member(String username, double leftMoney) {
        super(username, leftMoney);
    }

    public void openRedPacket(ArrayList<Double> list) {
        int index = new Random().nextInt(list.size());
        Double red = list.remove(index);
        setMoney(red);
    }
}

