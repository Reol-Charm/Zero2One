package cn.itcast.day15.oncourse;

import java.util.*;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/3 11:16
 * @version: 1.0
 */

public class HashMapStore {
    public static void main(String[] args) {
        hashMapShow();
        System.out.println("--------------------------------------------");
        listMapShow();

    }

    private static void listMapShow() {
        /*嵌套*/
        Map<String, List<Student>> listMap = new HashMap<>();
//      创建集合 对象.
        List<Student> list = new ArrayList<>();
        list.add(new Student("黑猫", 1));
        list.add(new Student("baimao", 2));
        /*添加键值进入集合*/
        listMap.put("猫的属性", list);
//       {猫的属性=[Student{name='黑猫', age=1}, Student{name='baimao', age=2}]}
        System.out.println("listMap = " + listMap);
        System.out.println("=================================");
        /*调用HashMap中 entrySet()方法*/
        Set<Map.Entry<String, List<Student>>> entrySet = listMap.entrySet();
        /*打印集合比照与 listMap 的不同*/
//        listMap = {猫的属性=[Student{name='黑猫', age=1}, Student{name='baimao', age=2}]}
//        entrySet = [猫的属性=[Student{name='黑猫', age=1}, Student{name='baimao', age=2}]]
        System.out.println("entrySet = " + entrySet);
        System.out.println("*********************************");
        /*利用 Map 接口内部嵌套接口 Map.Entry<K,V> `本质也是对象`遍历*/
        for (Map.Entry<String, List<Student>> entry : entrySet) {
            System.out.println("entry.getKey() = " + entry.getKey());
            System.out.println("entry.getValue() = " + entry.getValue());
        }

    }

    private static void hashMapShow() {
        HashMap<String, Student> map = new HashMap<>();
        map.put("hello", new Student("CAT", 1));
        map.put("WORLD", new Student("WCAT", 2));
        map.put("jAVA", new Student("bCAT", 3));

        /*entry() 对象遍历*/
        Set<Map.Entry<String, Student>> entrySet = map.entrySet();
        for (Map.Entry<String, Student> entry : entrySet) {
            String key = entry.getKey();
            Student value = entry.getValue();
            System.out.println("Key = " + key + "<--->" + "value = " + value);
        }

    }
}
