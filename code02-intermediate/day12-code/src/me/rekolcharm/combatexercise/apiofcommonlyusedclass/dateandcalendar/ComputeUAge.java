package me.rekolcharm.combatexercise.apiofcommonlyusedclass.dateandcalendar;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/7/30 13:12 - 30
 * @version: 1.0
 */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 1.获取当前时间对应的毫秒值
 * <p>
 * 2.获取自己出生日期对应的毫秒值
 * <p>
 * 3.两个时间相减（当前时间– 出生日期）
 */
public class ComputeUAge {
    /*获取当前时间对应的毫秒值*/
    public static void main(String[] args) throws ParseException {
        computeAge();
    }

    public static void computeAge() throws ParseException {
        System.out.println("请输入您的出生时间(format: yy-MM-dd): ");
        String birthdayStr = new Scanner(System.in).next();
        /*确定格式*/
        DateFormat bsf = new SimpleDateFormat("yy-MM-dd");
        /*解析输入字符串, 字符串类型必须与规定的一致.转换成Date类型*/
        Date birthdayDate = bsf.parse(birthdayStr);
        /*调用Date类中方法获取毫秒值,进行运算*/
        long secone = new Date().getTime() - birthdayDate.getTime();
//        System.out.println("new Date().getTime() - birthdayDate.getTime() = " + secone);
        /*将相差时间转换成对应时间*/
        if (secone < 0) {
            System.out.println("还没出生呢");
        } else {
            System.out.println("距离今天过去了: " + secone / 1000 / 60 / 60 / 24 + "天.");
//            System.out.println("活了: " + secone / 1000 / 60 / 60 / 24 / 30 + "月.");
//            System.out.println("活了: " + secone / 1000 / 60 / 60 / 24 / 30 / 12 + "年.");
        }
    }//1995-10-26
}
//2018-07-04-->2018-08-20
//距离今天过去了: 47天.
/*todo 管理员密码: 1298122445宽带账户号: 20571100066806宽带密码: mc8d2u*/
