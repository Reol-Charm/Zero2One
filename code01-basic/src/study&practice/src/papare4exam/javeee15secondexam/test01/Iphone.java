package papare4exam.javeee15secondexam.test01;
/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/23 19:26
 * @version:         1.0
 *
 */

public class Iphone extends Phone implements Bluetooth {
    public Iphone(String name) {
        super(name);
    }

    public Iphone() {

    }

    @Override
    public void btFunction() {
        System.out.println("支持蓝牙功能");
    }

    @Override
    public void playMusic(Song song) {
        System.out.println(super.getName() + " is playing " + song.getName() + " song by " + song.getSinger());
    }
}
