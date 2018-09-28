package cn.itcast.day15.oncourse;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/3 15:05 - 15:46
 * @version: 1.0
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 1. 获取字符串
 * 2. 遍历字符串, 获得每个字符
 * 3. 创建 Map 集合, 存储遍历的字符, 以及count++ 的键和值
 * 4. 判断 Map 集合中存在 key 否
 * 5. 存在时:
 * 获取到 key 对应的 value 值, value 值++, 再将 key 和 value 放进 Map 集合中, 进行下一次判断
 * 6. 不存在时:
 * 将首次的 key 和 value(为 1) 放进 Map 中
 */
public class CountMapTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input your string: ");
        String str = sc.next();
        judge(str);
    }

    private static void judge(String str) {
        Map<Character, Integer> hashMap = new HashMap<>();
        /*第一种遍历String方法*/
        char[] chars = str.toCharArray();
        for (char i : chars) {
//            判断字符(key)是否存在
            if (hashMap.containsKey(i)) {
                Integer value = hashMap.get(i);
                /*次数(value) 增加*/
                value++;
                /*将新的键值存进 Map: 字符并不改变, 但次数增加, 不断增加*/
                hashMap.put(i, value);
                /*第一次存储时, 设置次数*/
            } else {
                hashMap.put(i, 1);
            }
        }
        System.out.println("hashMap = " + hashMap);
    }
}
