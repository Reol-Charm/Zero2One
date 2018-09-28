package cn.itcast.day07.scanner;

import java.util.Scanner;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/7/16 10:42
 * @version: 1.0
 */

public class AnonyScanner {
    public static void main(String[] args) {
        asParam(new Scanner(System.in));
        System.out.println("------------------");

        Scanner sc1 = asReturn();
        System.out.println("3st input the num: ");
        int num1 = sc1.nextInt();
        System.out.println("4rd input the string: ");
        String str1 = sc1.next();
    }

    public static void asParam(Scanner sc) {
        System.out.println("1st input the num: ");
        int num1 = sc.nextInt();
        System.out.println("2rd input the string: ");
        String str1 = sc.next();
    }

    public static Scanner asReturn() {
        return new Scanner(System.in);
    }
}
