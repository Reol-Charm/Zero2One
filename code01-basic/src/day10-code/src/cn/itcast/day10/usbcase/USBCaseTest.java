package cn.itcast.day10.usbcase;
/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/21 18:36
 * @version:         1.0
 *
 */

public class USBCaseTest {
    public static void main(String[] args) {
//        instantiate Computer.
        Computer computer = new Computer();

        computer.powerOn();
//        polymorphic
//        instance Mouse.
        USB usbMouse = new Mouse();// Polymorphic and upcast.
//        说到底就是usbMouse.open();
        computer.USBdevice(usbMouse);
//        instantiate Keyboard.
        USB usbKey = new Keyboard();

        computer.USBdevice(usbKey);

        computer.powerOff();
    }

}
