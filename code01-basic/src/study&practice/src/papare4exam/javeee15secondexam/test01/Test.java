package papare4exam.javeee15secondexam.test01;
/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/23 20:02
 * @version:         1.0
 *
 */

public class Test {
    public static void main(String[] args) {
        Phone phone = new Iphone("Apple");
        Song s = new Song("Hello", "world~");
//        子类特有的方法: downcast();
        ((Iphone) phone).btFunction();
        ((Iphone) phone).connecting();
        phone.playMusic(s);
    }

}
