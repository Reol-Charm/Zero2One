package cn.itcast.day13.oncourse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/7/31 16:17
 * @version: 1.0
 */

public class PokerDemo {
    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>();
        sendPoker(poker);
        viewPoker(poker);
    }
//todo charAt()方法是哪里的什么方法?

    private static void sendPoker(ArrayList<String> poker) {
        poker.add("大王");
        poker.add("小王");
//        String[] color = {"♠", "♥", "♣", "♦"};
//        String[] sequence = {"2", "A", "k", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};

        // 用集合存储花色和序号.
        /*数字序列集合*/
        Collection<String> numColle = new ArrayList<>();
        for (int i = 10; i > 1; i--) {
            /*基本类型 ----> 字符串*/
            /*poker.add(String.valueOf(Integer.valueOf(i)*//*i*//*));*/
            /*poker.add(i + "");*/
            numColle.add(String.valueOf(i));
        }
        numColle.add("J");
        numColle.add("Q");
        numColle.add("K");
        numColle.add("A");

        /*花色集合*/
        Collection<String> colorColle = new ArrayList<>();
        colorColle.add("♥");
        colorColle.add("♦");
        colorColle.add("♠");
        colorColle.add("♣");

        /*fori 循环*/
        /** for (int i = 0; i < color.length; i++) {
         for (int j = 0; j < sequence.length; j++) {
         poker.add(color[i] + sequence[j]);
         }
         } */

        for (String aColor : colorColle) {
            for (int j = 0; j < numColle.size(); j++) {
                poker.add(aColor + ((ArrayList<String>) numColle).get(j));
            }
        }

        System.out.println(poker);

        /*调用方法 打乱*/
        Collections.shuffle(poker);

        System.out.println("poker.size() = " + poker.size());

    }


    private static void viewPoker(ArrayList<String> poker) {
        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();
        ArrayList<String> p3 = new ArrayList<>();
        ArrayList<String> finnal = new ArrayList<>();

        /*遍历牌库, 依照 `索引值 % 人数` 的不同效果, 给予每个人发牌. */
        for (int i = 0; i < poker.size(); i++) {
//            final = [♠J, 小王]
//            索引值从 0 开始的.最后一位时53.
//            if (i > 51)
            if (i > poker.size() - 4) {
                finnal.add(poker.get(i));
            } else if (i % 3 == 0) {
                p1.add(poker.get(i));
            } else if (i % 3 == 1) {
                p2.add(poker.get(i));
            } else {
                p3.add(poker.get(i));
            }
        }
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println("p3 = " + p3);
        System.out.println("finnal = " + finnal);

    }
}
