package me.rekolcharm.combatexercise.apiofcommonlyusedclass.wapperedclass;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/7/30 18:14
 * @version: 1.0
 */

public class WapperTest {
    public static void main(String[] args) {
        wapperTest();
    }

    private static void wapperTest() {
        Integer integer = new Integer("100");
        Integer integer1 = Integer.valueOf(200);

        System.out.println("integer.toString() = " + integer.toString());
        System.out.println("integer1 = " + integer1);


        int s = 100;
        String s2 = Integer.toString(s);
//        int s3 = s + s2; wrong! 类型不一致.
        String s3 = String.valueOf(100);

        Integer in = 1;//自动装箱. ----> Integer in = new Integer(1);
        int ni = in + 1;//自动拆箱 ----> int ni = in.intValue() + 1;
        int ni1 = in.intValue() + 1;
        System.out.println("ni = " + ni);



    }

}
