package cn.itcast.day15.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Description: 统计该集合中每个字符（注意，不是字符串）出现的次数。
 * @Author: Rekol
 * @CreateDate: 2018/8/4 10:12 10: 43
 * @version: 1.0
 */
//todo 比较不同.
/*/八、定义一个泛型为String类型的List集合，统计该集合中每个字符（注意，不是字符串）出现的次数。
例如：集合中有”abc”、”bcd”两个元素，程序最终输出结果为：“a = 1,b = 2,c = 2,d = 1”。*/

/*思路:
 * 1. 定义ArrayList集合, 添加元素
 * 2. 定义另一个 Map 集合, 存储 key<String> 和 value<Integer>
 * 3. 遍历list 集合, 获得key, 并自定义 count (value), 一并put()入 Map 集合中
 * 4. 输出 Map 内元素.*/
//❌ ... 审题不清
/*思路:
 * 1. 定义ArrayList集合, 添加元素
 * 2. 将元素转换成字符数组.,
 * 3. 遍历list, 如果有初始 key ,则 value++ (次数), 否则, 向 Map 添加新的 entry. */
public class Practice08 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("bcd");
        /*List.of("abc", "bcd");*/
//        show(list);
        count(list);
    }

    private static void count(ArrayList<String> list) {
        /* 获取字符数组的索引值*/
        int index = 0;
        for (String s : list) {
            index++;
        }
        int value = 0;
        /*创建 Map 对象, 存储 key () 和 value*/
        Map<Character, Integer> map = new HashMap<>();

        /*创建字符数组存储 list 中字符串转换后的字符*/
//        char[] strStorage = new char[index];
//   易❌点: 想多了: "将每个字符存储进 准备好的 字符数组容器", 没有必要, 在此题中.

        /*遍历 list 集合, 获取每一个元素, 并对每一个字符串元素, 进行转换成字符数组的操作*/
//        StringBuffer sb = new StringBuffer(strStorage.length);
        for (String s : list) {
//            获取每一个元素, 并转换成字符数组
//            sb.append(s);
//            char[] chars = s.toCharArray();

            char[] chars = toChar(s);

//            遍历字符数组, 获取字符串元素内每个字符.
            for (char aChar : chars) {
                /*将每个字符存储进 准备好的 字符数组容器, (存储 key 值)*/
                /*strStorage[index] = aChar;
                for (char c : strStorage) {
                    map.put(c, value);
                    System.out.println("map = " + map);
                }*/

//            判断字符(key)是否存在
                if (map.containsKey(aChar)) {
                    Integer val = map.get(aChar);
                    /*次数(value) 增加*/
                    val++;
                    /*将新的键值存进 Map: 字符并不改变, 但次数增加, 不断增加*/
                    map.put(aChar, val);
                    /*第一次存储时, 设置次数*/
                } else {
                    map.put(aChar, 1);
                }

            }
            /*准备 value */
//            value++;
        }
    }

    private static char[] toChar(String s) {
        return s.toCharArray();
    }


    private static void show(ArrayList<String> list) {
        Map<String, Integer> map = new HashMap<>();

        int count = 0;
        for (String s : list) {
            map.put(s, count);
            count++;
        }

        System.out.println("map = " + map);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.print(key + " = " + value + ", ");
        }

    }
}
