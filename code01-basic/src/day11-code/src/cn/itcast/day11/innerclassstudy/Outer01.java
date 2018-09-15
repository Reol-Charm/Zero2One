package cn.itcast.day11.innerclassstudy;
/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/22 18:55
 * @version:         1.0
 *
 */

public class Outer01 {
    int num = 12;

    public void outerMethod() {
        class Inner {
            int num = 23;

            public void show() {
                System.out.println("num = " + num);
                System.out.println("this.num = " + this.num);
                System.out.println("Outer01.this.num = " + Outer01.this.num);
            }
        }

        Inner inner = new Inner();
        inner.show();


    }

}
