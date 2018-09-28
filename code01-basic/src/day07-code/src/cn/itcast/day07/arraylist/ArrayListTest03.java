package cn.itcast.day07.arraylist;

import java.util.ArrayList;

/**
 * @Description:打印集合的方法要求的是: {element@element@element}
 * @Author: Rekol
 * @CreateDate: 2018/7/16 16:56
 * @version: 1.0
 */

public class ArrayListTest03 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Hello");
        al.add("World");
        al.add("arraylist<E>");

        printMethod(al);//{@Hello@World}    = =
//        要求的是: {element@element@element}
    }

    public static void printMethod(ArrayList<String> a) {

        /*System.out.print("{");
        for (int i = 0; i < a.size(); i++) {
//        a.size() - 1 就是最后一位的索引值
            if (i == a.size() - 1) {
                System.out.println("@" + a.get(i) + "}");
            } else {
                System.out.print("@" + a.get(i));
            }
        }*/

        /*System.out.print("{");
        for (int i = 0; i < a.size(); i++) {
            if (i != a.size() - 1) {
                System.out.print(a.get(i) + "@");
            } else {
                System.out.print(a.get(i));
            }
        }
        System.out.println("}");*/

        System.out.print("{");
        for (int i = 0; i < a.size(); i++) {
            String s = a.get(i);
            if (i != a.size() - 1) {
                System.out.print(s + "@");
            } else {
                System.out.print(s + "}");
            }
        }
        System.out.println();
    }
}
