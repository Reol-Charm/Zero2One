package cn.itcast.day07.scanner;

import java.util.Scanner;

/**
 * @Description: 使用匿名对象来进行传参.
 * @Author: Rekol
 * @CreateDate: 2018/7/16 10:12
 * @version: 1.0
 */

public class AnonymousAndScanner {
    public static void main(String[] args) {
        System.out.println("输入----第一次anonymous: ");
        asParameter(new Scanner(System.in));
//        System.out.println(asParameter(new scanner(System.in))); wrong!!!

//        int sc = anonymousAsReturn(); Wrong!!!
        System.out.println("Input----asreturn");
        Scanner sc = anonymousAsReturn();
        int num1 = sc.nextInt();
        System.out.println("num = " + num1);

    }

    public static void asParameter(Scanner sc) {
//        int num = sc.nextInt();
//        System.out.println("num = " + num);
        int num = sc.nextInt();
        System.out.println("num = " + num);
    }

    public static Scanner anonymousAsReturn() {
        return new Scanner(System.in);
    }

}
