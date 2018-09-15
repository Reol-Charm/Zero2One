package me.rekolcharm.day12.homeworks;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/7/30 19:39
 * @version: 1.0
 */
/*用程序判断2018年2月14日是星期几。*/
public class Test02 {
    public static void main(String[] args) throws ParseException {
        /*System.out.println("input: ");
        String input = new Scanner(System.in).next();
        judge(input);*/
        judge();
    }

    private static void judge(/*String input*/) throws ParseException {
        Calendar cale = Calendar.getInstance();
        cale.set(2018, 3, 15);
        /*int date = cale.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        System.out.println("date = " + date);*/
//        Date d = new Date(Calendar.YEAR, Calendar.MONTH, Calendar.DATE); wrong!!!
//        SimpleDateFormat sdf = new SimpleDateFormat();

//        Date par = sdf.parse("2018年2月14日");

        /*Calendar日期转换成Date*/
        Date date = cale.getTime();

//        int day = cale.get(Calendar.DAY_OF_WEEK);
//        System.out.println("一周第: " + day + " 天.");

        // 想多了...
        long week = date.getTime() / 1000 / 60 / 60 / 24 / 30;

        System.out.println("week = " + week);



    }

}
