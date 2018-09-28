package me.rekolcharm.combatexercise.apiofcommonlyusedclass.dateandcalendar;

import java.util.Date;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/7/30 9:39- 05
 * @version: 1.0
 */

public class TestDate {
    String name;

    public static void main(String[] args) {
        Date current = new Date();

        Date d1 = new Date(999999999);

        Date d2 = new Date(System.currentTimeMillis() - 1000000);
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("current = " + current);
        /*getTime() get 当前时间下的毫秒值. *///9999999
        System.out.println("d1.getTime() = " + d1.getTime());

        /*test whether before
        if equation return 0; if min return -1; if greater than currentDate return 1;
        * */
        System.out.println("d1.compareTo(d2) = " + d1.compareTo(d2));

        System.out.println("d1.before(d2) = " + d1.before(d2));
        /*equals()*/
        System.out.println("d1.equals(d2) = " + d1.equals(d2));
        /*System.currentTimeMillis()*///System.currentTimeMillis() = 1532918906413
        System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());

    }


}
