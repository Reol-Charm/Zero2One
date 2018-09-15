package me.rekolcharm.day12.homeworks;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/7/30 21:27
 * @version: 1.0
 */

public class Test0110Correct {
    public static void main(String[] args) throws ParseException {
        convert("2018-03-04");
    }

    private static void convert(String str) throws ParseException {

        /*二、使用SimpleDateFormat类,把2018-03-04转换为2018年03月04日。*/
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        Date d1 = sdf.parse(str);

        SimpleDateFormat sdf1 = new SimpleDateFormat("y年MM月dd日");
//          2018-03-04
//          String d2 = sdf.format(/*d1*/sdf.parse(str));
//          2018年03月04日
        String d2 = sdf1.format(/*d1*/sdf.parse(str));
        String d3 = sdf1.format(sdf.parse(str));
        System.out.println("d2 = " + d2);
        System.out.println("d2 = " + d3);
    }
}
