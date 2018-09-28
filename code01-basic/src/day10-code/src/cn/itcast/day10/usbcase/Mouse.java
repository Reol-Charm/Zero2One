package cn.itcast.day10.usbcase;
/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/21 18:18
 * @version:         1.0
 *
 */

public class Mouse implements USB{
    @Override
    public void open() {
        System.out.println("open mouse.and override.");
    }

    @Override
    public void close() {
        System.out.println("close mouse and override.");
    }

    public void showMouseSelf() {
        System.out.println("specific method of Mouse.");
    }
}
