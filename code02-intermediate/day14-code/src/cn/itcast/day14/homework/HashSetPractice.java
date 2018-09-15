package cn.itcast.day14.homework;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/16 19:00
 * @version: 1.0
 */
/*十二、双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。
红色球号码从1—33中选择；
蓝色球号码从1—16中选择；
请随机生成一注双色球号码。（要求同色号码不重复）*/
public class HashSetPractice {
    public static void main(String[] args) {
        getRedBall();
    }

    private static void getRedBall() {
        /*2. 将 红球六个数字存进 HashSet 集合中*/
        HashSet<Integer> ballNum = new HashSet<>();
        for (int i = 0; i < 6; i++) {
            Integer redNum = getRandomNum();
            ballNum.add(redNum);
        }
        Integer blueNum = new Random().nextInt(16);
        System.out.println("红色球的数字为: ");
//todo 能不能对HashSet内元素进行排序?
//        Collections.sort(ballNum);

        for (Integer redNum : ballNum) {
            System.out.print(redNum + " ");
        }

        System.out.println();
        System.out.println("蓝色球数字为: ");
        System.out.println(blueNum);
    }

    private static Integer getRandomNum() {
        Random random = new Random();
        int ranNum = random.nextInt(33) + 1;
        return ranNum;
    }
}
