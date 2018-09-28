package cn.itcast.day10.usbcase;
/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/21 17:03
 * @version:         1.0
 *
 */

public class Computer {
    public void powerOn() {
        System.out.println("power on");
    }

    //    使用USB设备的方法, 使用接口作为方法的参数.
    public void USBdevice(USB u) {
        u.open();
//        downcast to call itself method.
        if(u instanceof Mouse){
            Mouse m = (Mouse) u;
            m.showMouseSelf();
        } else if (u instanceof Keyboard) {
            Keyboard k = (Keyboard) u;
            k.showKeySelf();
//            m.showshowMouseSelf();        wRONG!
        }
        u.close();
    }
    public void powerOff() {
        System.out.println("Power off");

    }

}
