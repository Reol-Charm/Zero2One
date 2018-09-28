package me.rekolcharm.combatexercise.apiofcommonlyusedclass.dateandcalendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/7/30 12:43 -13
 * @version: 1.0
 */

public class DateFormateTest {
    public static void main(String[] args) throws ParseException {
        /*确立时间格式*/
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        /*将当前时间转换成需要的格式*/
        System.out.println("df.format(new Date()) = " + df.format(new Date()));

        /*获取当前时间的字符串*/
        String strDate = new Date().toString();
        System.out.println("strDate = " + strDate);

        /*将已知的时间字符串转换成系统格式*/
        Date d = df.parse("2019-3-4 23:34:45");
        System.out.println("d = " + d);
        /*再将获取到的已是系统格式的时间转换成目标格式.*/
        System.out.println("df.format(d) = " + df.format(d));


    }

}
