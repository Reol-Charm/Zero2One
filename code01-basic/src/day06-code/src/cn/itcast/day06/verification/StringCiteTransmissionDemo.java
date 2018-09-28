package cn.itcast.day06.verification;

/**
 * @Description:每一个字符串对象都表示一个匿名对象(参考匿名对象的规则) 为 str2 重写设置内容,相当于改变了 str2 的引用(地址值改变.) , 而 str1 本身内容不受任何影响.
 * str2 在堆内存中有新的地址值.
 * @Author: Rekol
 * @CreateDate: 2018/7/15 15:53
 * @version: 1.0
 */

public class StringCiteTransmissionDemo {
    public static void main(String[] args) {
        String str1 = "Hello";
        System.out.println("方法调用前");
        System.out.println("str1 = " + str1);
        fun(str1);
        System.out.println("===========");
        System.out.println("fun()调用后");
        System.out.println("str1 = " + str1);//str1 = Hello
        System.out.println("===========");
        String newStr = fun02(str1);
        System.out.println("newStr = " + newStr);
        System.out.println("str1 = " + str1);//str1 = Hello, str1 still is "Hello".
//        System.out.println("str2 = " + str2);
    }

    public static void fun(String str2) {
        str2 = "World??";
        System.out.println("str2 = " + str2);
    }

    public static String fun02(String str02) {
        return str02 = "World??";
    }
}
