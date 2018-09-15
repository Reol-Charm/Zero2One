package cn.itcast.day15.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/3 20:42
 * @version: 1.0
 */

/*
1.遍历集合，并将序号与对应人名打印。
2.向该 map 集合中插入一个编码为5姓名为李晓红的信息
3.移除该map中的编号为1的信息
4.将map集合中编号为2的姓名信息修改为"周林" */
public class Test01 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");
//        2.向该 map 集合中插入一个编码为5姓名为李晓红的信息
        map.put(5, "李晓红");
//        1.遍历集合，并将序号与对应人名打印。
        show(map);
//        3.移除该map中的编号为1的信息
        System.out.println(map.remove(1));
//        4.将map集合中编号为2的姓名信息修改为"周林" */
        map.put(2, "周林");
        System.out.println("map = " + map);
    }

    private static void show(HashMap<Integer, String> map) {
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.print("key = " + key + "\t");
            System.out.println("value = " + value);
        }
    }
}
