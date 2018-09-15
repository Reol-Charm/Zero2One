package cn.itcast.day08.string;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/7/18 18:47
 * @version: 1.0
 */

public class FourInstanceWayofString {
    public static void main(String[] args) {
//        下面三个构造方法
        String str = new String();
//通过字符数组构造
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        String str2 = new String(chars);
        System.out.println("str2 = " + str2);
//通过字节数组构造
        byte[] bytes = {97, 98, 99};
        String str3 = new String(bytes);
        System.out.println("str3 = " + str3);

        String str4 = "ABC";
        System.out.println("str4 = " + str4);

        String[] strings = {str3, str4};
        System.out.println("strings = " + strings);

        int[] numArray = {12,232,323,24254};
        System.out.println("numArray = " + numArray);// 数组存储的是地址值, 而字节数组或者字符数组用 String 变量盛装, 直接打印输出

    }
}
