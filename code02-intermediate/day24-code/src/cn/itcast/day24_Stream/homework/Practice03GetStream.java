package cn.itcast.day24_Stream.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/22 20:22
 * @version: 1.0
 */

public class Practice03GetStream {
    /**
     * 问题：
     * 简述单列集合、双列集合、数组分别如何获取Stream流对象，并进行演示
     */
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        Stream<String> stream = map.keySet().stream();
        Stream<Integer> stream1 = map.values().stream();
        Stream<Map.Entry<String, Integer>> entryStream = map.entrySet().stream();

        String[] arr = new String[]{"黄药师", "冯蘅", "郭靖", "黄蓉", "郭芙", "郭襄", "郭破虏"};
        Stream<String> arrStream = Stream.of(arr);
        Stream<String> arrMethodStream = Arrays.stream(arr);
//        arrMethodStream = java.util.stream.ReferencePipeline$Head@71be98f5
//        arrStream = java.util.stream.ReferencePipeline$Head@6fadae5d
        System.out.println("arrMethodStream = " + arrMethodStream);
        System.out.println("arrStream = " + arrStream);
//        str = null
//        str = null...
        arrStream.forEach(str -> System.out.println("str = " + str));
//        郭靖
//filterstr = 郭芙
//filterstr = 郭襄
//filterstr = 郭破虏
        String[] toArray = arrMethodStream.filter(str -> str.startsWith("郭"))
                /** 使用Stream将以郭字开头的元素存入新数组*/
                .toArray(String[]::new);
//                 wrong!
//                .forEach(str -> System.out.println("filterstr = " + str));
    }
}
