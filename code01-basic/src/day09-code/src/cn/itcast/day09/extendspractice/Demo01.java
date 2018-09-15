package cn.itcast.day09.extendspractice;

/*
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/7/19 10:31
 * @version: 1.0
 */

import javax.swing.*;

public class Demo01 {
    public static void main(String[] args) {
//        PhoneFu p1 = new PhoneFu();
        PhoneZi p2 = new PhoneZi();
        p2.setName("Apple");
        p2.setPrice(8888);
        p2.show();
        p2.setColor("BLue");
        p2.method();
        System.out.println("--------------");
        PhoneZi p3 = new PhoneZi("Mi", 6777, "Red");
        System.out.println(p3.getColor());

    }
}
