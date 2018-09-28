package cn.itcast.day15.homework;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/4 11:36
 * @version: 1.0
 */
/**/
public class Practice8 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("abc");
        arr.add("bcd");
        HashMap<Character, Integer> hm = new HashMap<>();
        /*获取到 ArrayList 集合中的 字符串 元素*/
        for (String s : arr) {
            /*字符串转换成 字符数组, 获取每个 字符.*/
            for (char c : s.toCharArray()) {
                /*获取拿到每个字符,使用字符去HashMap中查找次数*/
                Integer value = hm.get(c);
                /*如果没有, 说明是第一次, value 值为 1*/
                if (value == null) {
                    hm.put(c, 1);
                    /*如果有, value 值相应的 +1*/
                } else {
                    value++;
                    hm.put(c, value);
                }
            }
        }

        System.out.println("hm = " + hm);
    }

}
