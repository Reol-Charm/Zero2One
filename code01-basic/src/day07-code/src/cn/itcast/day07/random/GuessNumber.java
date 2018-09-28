package cn.itcast.day07.random;

import java.util.Random;
import java.util.Scanner;

/**
 * @Description: 猜数字游戏
 * @Author: Rekol
 * @CreateDate: 2018/7/16 11:26
 * @version: 1.0
 */

public class GuessNumber {
    public static void main(String[] args) {

        Random r = new Random();
        int randomNum = r.nextInt(100) + 1;//[1.100]

        Scanner sc = new Scanner(System.in);
        int count = 0;
        do {
            count++;
            System.out.println("Input your guessNum: ");
            int gueseNum = sc.nextInt();

            if (gueseNum > randomNum) {
                System.out.println("biger, try it again~");

            } else if (gueseNum < randomNum) {
                System.out.println("smaller, try it again~");

            } else {
                System.out.println("Congratulation!");
                System.out.println("你用了: " + count + " 次机会, 很厉害!");
                break;
            }
            System.out.println("这是你第 " + count + " 次猜.");

            if (count > 9) {
                System.out.println("你用完了 " + count + " 次机会, 你输了!");
                break;
            }

        } while (true);

    }
}
