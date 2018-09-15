package me.rekolcharm.combatexercise.apiofobject;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/7/29 16:29-35
 * @version: 1.0
 */
interface A {
    public abstract String getInfo();
//    String getInfo(); 默认是抽象方法.

}
class B implements A {
    @Override
    public String getInfo() {
        return "Hello World!!!";
    }
}

public class ObjectReceiveReferenceDate {
    public static void main(String[] args) {
        A a = new B();
        /*Object class receive every reference date type.*/
        Object obja = a;

        A x = (A) obja;

        System.out.println("x.getInfo() = " + x.getInfo());

    }
}
