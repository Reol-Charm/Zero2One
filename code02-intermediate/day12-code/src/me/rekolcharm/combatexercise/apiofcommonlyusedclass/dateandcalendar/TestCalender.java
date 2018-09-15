package me.rekolcharm.combatexercise.apiofcommonlyusedclass.dateandcalendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/7/30 14:50
 * @version: 1.0
 */

public class TestCalender {
    public static void main(String[] args) {
//        private static method.
//        Calendar cale = new Calendar.getInstance();

        Calendar cale = Calendar.getInstance();
//        cale = java.util.GregorianCalendar
// [time=1534164192750,areFieldsSet=true,areAllFieldsSet=true,lenient=true,
// zone=sun.util.calendar.ZoneInfo
// [id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=19,lastRule=null],
// firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2018,MONTH=7,WEEK_OF_YEAR=33,WEEK_OF_MONTH=3,
// DAY_OF_MONTH=13,DAY_OF_YEAR=225,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,
// MINUTE=43,SECOND=12,MILLISECOND=750,ZONE_OFFSET=28800000,DST_OFFSET=0]
        System.out.println("cale = " + cale);
//        cale.get(Calendar.YEAR) = 2018
        System.out.println("cale.get(Calendar.YEAR) = " + cale.get(Calendar.YEAR));

        System.out.println("cale.get(Calendar.MONDAY) = " + cale.get(Calendar.MONDAY));

//        System.out.println("cale.add(Calendar.YEAR + 10) wrong!!!
        cale.add(Calendar.YEAR, 1);
        System.out.println("cale.get(Calendar.YEAR) = " + cale.get(Calendar.YEAR));
        cale.set(Calendar.YEAR, 999999);
        System.out.println("cale.get(Calender.Year) = " + cale.get(Calendar.YEAR));

        /*//        Date date = cale.getTime();*/
        System.out.println("date = " + cale.getTime());
        cale.add(Calendar.MILLISECOND,12);
        cale.set(Calendar.YEAR, 2018);

        cale.getTime().getTime();
        //1532937657447
        System.out.println("cale.getTime().getTime() = " + cale.getTime().getTime());

//        获取到当下的毫秒值.
        long starTime = System.currentTimeMillis();

        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
        String dateStr = df.format(starTime);
        //18年07月30日
        System.out.println("df.format(starTime) = " + dateStr);


//        System.ArrayCopy();


    }
}
