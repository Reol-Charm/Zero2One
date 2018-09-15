package cn.itcast.day15.oncourse;

import java.util.*;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/3 17:17 - 18: 37 - 20 : 20
 * @version: 1.0
 */

/**
 * 1. 创建花色以及数字的集合
 * 2. 创建牌面.
 * 3. 将花色以及数字组合成牌面:
 * ---->循环遍历,添加进 Map 集合.
 * 4. 创建索引集合,
 * 5. 利用索引进行判断分牌等操作.
 * 6. 查表法, 将分配好的索引牌面 key 转换成 Map 中对应的 value 值
 */


public class MapIndexPokerGame {
    public static void main(String[] args) {
        /*1. 创建花色以及数字的集合 */
//        List<Integer> numbers = new ArrayList<>();
        List<String> colors = List.of("♠", "♥", "♣", "♦");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        /*2. 创建牌面.*/
        Map<Integer, String> poker = new HashMap<>();
        /*3. 将花色以及数字组合成牌面*/
        /*Set<Map.Entry<Integer, String>> entrySet = poker.entrySet();      //思路错误❌
        for (Map.Entry<Integer, String> entry : entrySet) {
            Integer key = entry.getKey();
        }*/
        /*4. 创建索引集合, 利用索引进行判断分牌等操作.*/

        ArrayList<Integer> pokerIndex = new ArrayList<>();

        int index = 0;
        /*添加大小王, 并将对应索引 key++*/
        poker.put(index, "da");
        pokerIndex.add(index);
        index++;
        poker.put(index, "xiao");
        pokerIndex.add(index);
        index++;

        for (String number : numbers) {
            for (String color : colors) {
//                缺少索引 key, 所以引入 key
//                {0=♦3}
                poker.put(index, number + color);
//                index++;
                /*将索引 key 添加到索引集合中. */
                pokerIndex.add(index);
                index++;
            }
        }

//        System.out.println("poker = " + poker);
//        54
//        System.out.println("poker.size() = " + poker.size());
//        System.out.println("indexList = " + indexList);
        /*打乱牌面, 准备发牌*/

        Collections.shuffle(pokerIndex);
//        System.out.println(pokerIndex);
        System.out.println(poker);

        /*利用索引List集合, 进行发牌操作*/
        ArrayList<Integer> p1 = new ArrayList<>();
        ArrayList<Integer> p2 = new ArrayList<>();
        ArrayList<Integer> p3 = new ArrayList<>();
        ArrayList<Integer> finnal = new ArrayList<>();

        /*for (Integer cardNum : indexList) {
            if (cardNum >= 51) {
                finnal.add(cardNum);
            } else if (cardNum % 3 == 0) {
                p1.add(cardNum);
            } else if (cardNum % 3 == 1) {
                p2.add(cardNum);
            } else if (cardNum % 3 == 2) {
                p3.add(cardNum);
            }
            cardNum++;
        }*/
        for (int i = 0; i < pokerIndex.size(); i++) {
//            利用索引进行判断
            if (i >= 51) {
                finnal.add(pokerIndex.get(i));
            } else if (i % 3 == 0) {
                p1.add(pokerIndex.get(i));
            } else if (i % 3 == 1) {
                p2.add(pokerIndex.get(i));
            } else if (i % 3 == 2) {
                p3.add(pokerIndex.get(i));
            }
        }

        /*对玩家牌面进行排序.*/
        Collections.sort(p1);
        Collections.sort(p2);
        Collections.sort(p3);
        Collections.sort(finnal);
//        System.out.println("p1 = " + p1);
//        System.out.println("p2 = " + p2);
//        System.out.println("p3 = " + p3);
//        System.out.println("finnal = " + finnal);
//        System.out.println("-----------------------------------------------");
        /*利用 排序好的 key 值, 获取对应的 value 值.*/
        getValue("cat", poker, p1);
        getValue("dog", poker, p2);
        getValue("fish", poker, p3);
        getValue("balance", poker, finnal);
    }

    private static void getValue(/*List<Integer> indexList,*/String name, Map<Integer, String> poker, List<Integer> player) {
        /*Set<Map.Entry<Integer, String>> entries = poker.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {}
        for (Integer index : indexList) {}*/         // 思路错误❌
        /*将玩家的牌索引转换成牌面*/
        System.out.print(name + ": ");
        for (Integer p : player) {
            String value = poker.get(p);
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

