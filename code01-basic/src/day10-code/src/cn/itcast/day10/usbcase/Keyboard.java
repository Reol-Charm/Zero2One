package cn.itcast.day10.usbcase;
/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/21 18:22
 * @version:         1.0
 *
 */

public class Keyboard implements USB {

    @Override
    public void open() {
        System.out.println("open keyboard, override.");
    }

    @Override
    public void close() {
        System.out.println("close keyboard, override.");

    }
    public void showKeySelf() {
        System.out.println("specific method of Keyboard.");
    }
}
