package cn.itcast.day10.interfacestudy;
/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/21 19:57
 * @version:         1.0
 *
 */

public class MethodImplement implements InterfaceName {
    //
    public static void showMetImpl() {
        System.out.println("Implement Method.");
    }

    @Override
    public void showAbsMethod() {
        System.out.println("Implement method override the abstract method in Interface.");
    }

    public static void main(String[] args) {
        showMetImpl();
//        Wrong!!! this is abstract method , so.
//        InterfaceName.showAbsMethod();
        InterfaceName.showSicMethod();


    }


}
