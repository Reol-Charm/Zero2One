package me.rekolcharm.selftaughtbook;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/7/26 11:37
 * @version: 1.0
 */

public class Son extends Father {
    String name = "Son";
    @Override
    public void say1() {
//        super.say1();
        System.out.println("son say1()");
    }
}
