package cn.itcast.day06.verification;

/**
 * @Description: string 的两种实例化方式,以及对比;P114
 * @Author: Rekol
 * @CreateDate: 2018/7/15 10:26
 * @version: 1.0
 */

public class StringTwoInstance {
    public static void main(String[] args) {
        String str01 = "Hello ";
//      第二种基于String 是一种类,直接调用 string 类中的构造方法
        String str02 = new String("Hello ");

        String str03 = str02;
        System.out.println("str01 == str02? : " + (str01 == str02));
        System.out.println("str01 == str03? : " + (str01 == str03));
        System.out.println("str03 = " + str02 + "?");
        System.out.println("str02 == str02? : " + (str02 == str03));
        System.out.println("=========================");
        System.out.println("str01 == str02? " + str01.equals(str02));
        System.out.println("str01 == str02? : " + (str01.equals(str03)));
        System.out.println("str01 == str03? : " + (str02.equals(str03)));

    }
}
