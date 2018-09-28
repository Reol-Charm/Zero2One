package cn.itcast.day11.innerclassstudy;
/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/22 19:01
 * @version:         1.0
 *
 */

public class InnerMethodDemo01 {
    public static void main(String[] args) {

        Outer01 outer01 = new Outer01();
        outer01.outerMethod();
        /*num = 23
this.num = 23
Outer01.this.num = 12
*/
    }

}
