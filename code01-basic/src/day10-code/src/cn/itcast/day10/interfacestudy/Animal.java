package cn.itcast.day10.interfacestudy;
/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/21 20:10
 * @version:         1.0
 *
 */

public class Animal implements LiveAble {
    @Override
    public void fly() {
        System.out.println("Fly randomly.");
    }
//    can not override static method
    public static void run() {
        System.out.println("Have to run.");
    }


}
