package cn.itcast.day07.scanner;

import java.util.Scanner;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/7/16 9:46
 * @version: 1.0
 */

public class ScannerAndAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your first number: ");
        int num1 = sc.nextInt();
        System.out.println("Please input your second number: ");
        int num2 = sc.nextInt();

        int add = num1 + num2;
        System.out.println("The add of two numbers is: " + add);

        System.out.println("特殊情况");

        String str2 = sc.nextLine();
        String str1 = sc.next();
        System.out.println("str2 = " + str2);
        System.out.println("str1 = " + str1);

    }
}
