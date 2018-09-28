package cn.itcast.day11.innerclassstudy;
/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/22 18:42
 * @version:         1.0
 *
 */

public class Outer {

    public void methodOuter() {
        class Inner {
            int num = 10;

            public void methodInner() {
                System.out.println(num);
            }
        }
        Inner inner = new Inner();
        inner.methodInner();

    }

}
