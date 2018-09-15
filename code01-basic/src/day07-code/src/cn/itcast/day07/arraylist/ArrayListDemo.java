package cn.itcast.day07.arraylist;

import java.util.ArrayList;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/7/16 15:37
 * @version: 1.0
 */

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        System.out.println("list = " + list);//[Hello, World]
        System.out.println(list.get(1));
        list.set(1,"teriteri");
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list = " + list);
    }
}
