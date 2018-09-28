package cn.itcast.day14.oncourse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/2 19:10 - 57
 * @version: 1.0
 */

public class MethodOfList {
    public static void main(String[] args) {
//        List 为接口, 只能通过实现类对象调用
        List<String> list = new ArrayList<>();
//        👇是静态方法的调用方式, ∵ add()是non-static, ∴ ❌
//        ArrayList.add("Hello?");
//         下面这种方法是哪个集合框架的?--> add() 方法, 多态, 或者自身对象调用
        list.add("Hello?");
        list.add(" world?");
        System.out.println("list = " + list
                /*IndexOutOfBoundsException: Index: 3, Size: 2*/);
//        list.add(3, "Java!");

        list.add(2, "Java!");// [Hello?,  world?, Java!]

        System.out.println("list = " + list);
//          todo: 集合中 contains() 方法与数组 contains() 方法的区别.
//        boolean r = list.contains("r");// false
        boolean r = list.contains(" ");//   false
        System.out.println("r = " + r);

        Boolean java = list.contains("Java!");
        System.out.println("java = " + java);

        int indexOf = list.indexOf("world");//  -1
        int indexOf01 = list.indexOf(" world?");//  2
        System.out.println("indexOf = " + indexOf);
        System.out.println("indexOf01 = " + indexOf01);
//        todo remove()删除指定位置元素, 数组以及集合的区别.有一个是返回boolean, 有一个是返回被删除的元素.
        /*IndexOutOfBoundsException: Index 3 out-of-bounds for length 3*/
//        System.out.println("list.get(3) = " + list.get(3));
        System.out.println("list.get(2) = " + list.get(2));

        for (String i : list) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("-------------");

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println("reverse-->list.get(i) = " + list.get(i));
        }
        
        /*Iterator*/
        Iterator itr = list.listIterator();
        while (itr.hasNext()) {
            /*ConcurrentModificationException*/
//            list.add("HELLO");
            System.out.println("itr.next() = " + itr.next());
        }
        
    }
}
