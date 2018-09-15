package cn.itcast.day07.random;

import java.util.Random;

/**
 * @Description: [65, 90] ----> [0,25] ----> [0, 26)
 * @Author: Rekol
 * @CreateDate: 2018/7/16 14:42
 * @version: 1.0
 */

public class RandomAdditional {
    public static void main(String[] args) {
        char c = 65;
        System.out.println("c = " + c);
        char c1 = 90;
        System.out.println("c1 = " + c1);

        Random r = new Random();

        String storeRandomNum = "";

        for (int i = 0; i < 5; i++) {//控制输出多少个字母.
            int randomNum = r.nextInt(26) + 65;
            char characters = (char) randomNum;
            System.out.println("randomNum = " + randomNum);


//            storeRandomNum += randomNum;//导致输出结果:storeRandomNum = 7671668378
            storeRandomNum += characters;
//            char alp = (char) storeRandomNum;
        }
        System.out.println("storeRandomNum = " + storeRandomNum);
    }
}
