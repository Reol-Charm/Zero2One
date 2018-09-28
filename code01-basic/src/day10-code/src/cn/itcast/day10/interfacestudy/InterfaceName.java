package cn.itcast.day10.interfacestudy;
/*@Description:     接口内五种内容.
 * @Author:          Rekol
 * @CreateDate:      2018/7/21 19:36
 * @version:         1.0
 *
 */

public interface InterfaceName {

    //    1. abstract method format.
    public abstract void showAbsMethod();

    //    2. default method format.
    public default void showDefMethod() {
        System.out.println("default method");
//        Normal private called by default method.
        showPratMethod();
    }

    //        3. static method format.
    public static void showSicMethod() {
        System.out.println("static method.");
//        static method call the normal private method.
        showPratSicMethod();
//
//        showPratMethod();     WRONG!!!
    }

    //    4.1 normal private method format:
    private void showPratMethod() {
        System.out.println("Normal private method");

    }

    //        4.2 static private method format:
    private static void showPratSicMethod() {
        System.out.println("Private static method format.");
//        5. Constant. -->  variable in Interface.
        final int NUMBER_ONE = 29;
    }
}
