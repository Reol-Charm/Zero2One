package cn.itcast.day07.random;

import java.util.Random;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/7/16 11:02
 * @version: 1.0
 */

public class RandomDemo01 {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println("r.nextDouble() = " + r.nextDouble());
        /*1. `5.fori`
        * 2. random().nextInt(bound);   [0,5)
        * */
        for (int i = 0; i < 5; i++) {
            System.out.println("r.nextInt(5) = " + r.nextInt(5));
        }
        /** 1.生成5个 [6,10]之间的数
         * 2. random.nextInt(5) + 6
         * 3. [0,5) ----> [6, 11) ----> [6, 10]
         * */
        for (int i = 0; i < 5; i++) {
            System.out.println("r.nextInt(5) + 6 = " + (r.nextInt(5) + 6));
        }
    }
}
