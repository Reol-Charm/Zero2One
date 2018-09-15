package cn.itcast.day10.polymorphic;
/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/21 21:22
 * @version:         1.0
 *
 */

public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("Eat fish.");
    }
}
