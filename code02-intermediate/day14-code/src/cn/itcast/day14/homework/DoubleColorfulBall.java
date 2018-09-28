package cn.itcast.day14.homework;

import java.util.HashSet;
import java.util.Random;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/16 18:55
 * @version: 1.0
 */

public class DoubleColorfulBall {
    public static void main(String[] args) {
        // 1.创建Random随机数对象
        Random random = new Random();

        // 2.创建HashSet用于保存不重复的红球
        HashSet<Integer> hashSet = new HashSet<>();

        // 3.循环判断红球数量是否小于6个
        while (hashSet.size() < 6) {
            // 4.球数量小于6个就产生一个红球.添加到HashSet中
            // 5.如果产生重复号码，往HashSet里添加不进去，所以会再次生成号码
            int num = random.nextInt(33) + 1;
            hashSet.add(num);
        }

        // 6.再生成一个篮球
        int blueBall = random.nextInt(16) + 1;

        // 7.打印中奖号码
        System.out.println("双色球中奖号码:");
        System.out.print("红球是: ");

        for (Integer redBall : hashSet) {
            System.out.print(redBall + " ");
        }
        System.out.println();
        System.out.println("蓝球是: " + blueBall);
    }
}
