package me.rekolcharm.day12.homeworks;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/7/30 19:18
 * @version: 1.0
 */

public class Test01 {
    public static void main(String[] args) throws ParseException {
        convert(/*"2018-03-04"*/);

    }

    private static void convert(/*String str*/) throws ParseException {
        Calendar cale =Calendar.getInstance();
        cale.set(2018, 03, 04);
        Date targetDate = cale.getTime();

        DateFormat sdf = new SimpleDateFormat("2018年03月04日");

        String date = sdf.format(targetDate);

        System.out.println("date = " + date);
//        Date parseDate = sdf.parse(str);
    }
    /*二、使用SimpleDateFormat类,把2018-03-04转换为2018年03月04日。*/

}
/*Calendar 与 Date 的互通.
* */
