package cn.itcast.day10.polymorphic;
/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/21 21:23
 * @version:         1.0
 *
 */

public class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("Gnaw bone.");
    }
}
