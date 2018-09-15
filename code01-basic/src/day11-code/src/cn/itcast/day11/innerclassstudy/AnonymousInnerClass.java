package cn.itcast.day11.innerclassstudy;
/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/22 19:13
 * @version:         1.0
 *
 */

public class AnonymousInnerClass {
    public static void main(String[] args) {
        MyInterface obj = new MyInterface() {
            @Override
            public void show() {
                System.out.println("Anonymous inner class implement interface.");
            }

            @Override
            public void show01() {
                System.out.println("default method show01");
            }
        };
        obj.show();
        obj.show01();//有对象就随便调用方法

        new MyInterface() {
            @Override
            public void show() {
                System.out.println("Again show");
            }

            @Override
            public void show01() {
                System.out.println("default method show01");
            }
        }.show01();//show()就不能访问到, 只能再重新new省略对象的匿名内部类

    }

}
