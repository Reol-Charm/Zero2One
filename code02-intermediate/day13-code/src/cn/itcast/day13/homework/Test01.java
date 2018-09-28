package cn.itcast.day13.homework;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/7/31 19:23 - 20:13....
 * @version: 1.0
 */

import java.util.ArrayList;
import java.util.Collection;

/**
 * 一, 给定以下代码，请定义方法public static int listTest(Collection<String> list,String s)统计集合中指定元素出现的次数，
 * 如"a":2,"b": 2,"c" :1, "xxx":0。
 * Collection<String> list = new ArrayList<>();
 * list.add("a");
 * list.add("a");
 * list.add("b");
 * list.add("b");
 * list.add("c");
 * System.out.println("a:"+listTest(list, "a"));
 * System.out.println("b:"+listTest(list, "b"));
 * System.out.println("c:"+listTest(list, "c"));
 * System.out.println("xxx:"+listTest(list, "xxx"));
 */

public class Test01 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        System.out.println("list = " + list);
        System.out.println("a:" + listTest(list, "a"));
        System.out.println("b:" + listTest(list, "b"));
        System.out.println("c:" + listTest(list, "c"));
        System.out.println("xxx:" + listTest(list, "xxx"));

    }

    public static int listTest(Collection<String> list, String s) {
        int count = 0;
        /*case 1: 利用for循环遍历统计*/
       /* for (String i : list) {

            if (list.toString().contains(s)) {
                count++;

            }
            return count;
        }*/

       /*case 2: fori */
        for (int i = 0; i < list.size(); i++) {
            /** 集合转换成数组, 用数组里的contains()方法处理.*/
            //todo: 1.理清楚集合,数组,字符串的转化
            //todo: 2.各个常用方法总结.
            String[] arr = list.toArray(new String[0]);
            if (s.contains(arr[i])) {
                count++;
            }
        }
        return count;
    }
}

