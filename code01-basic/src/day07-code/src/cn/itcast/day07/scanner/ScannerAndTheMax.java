package cn.itcast.day07.scanner;

import java.util.Scanner;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/7/16 9:50
 * @version: 1.0
 */

public class ScannerAndTheMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The first number: ");
        int num1 = sc.nextInt();
        System.out.println("The second number: ");
        int num2 = sc.nextInt();
        System.out.println("The third number: ");
        int num3 = sc.nextInt();

        int max = (num1 > num2 && num1 > num2 ? num1 : (num2 > num3 ? num2 : num3));
        System.out.println("max = " + max);


    }
}
