package cn.itcast.day14.oncourse;

import java.util.LinkedList;

/**
 * @Description: Some special method in LinkedList
 * 该集合存储结构为链表结构, 所以有查慢, 易改
 * @Author: Rekol
 * @CreateDate: 2018/8/2 19:59 - 20
 * @version: 1.0
 */

public class MethodOfLLinkedList {
    /*大量首尾操作;特有方法: pop() 和 push() 方法.*/
    public static void main(String[] args) {
//        LinkedList llist = new LinkedList<>();
        LinkedList<String> llist = new LinkedList<>();

        llist.addFirst("Hello");
        llist.addFirst("wold");
        llist.addLast("Java~");
        /*t = [wold, Hello, Java~]*/
        System.out.println("llist = " + llist);
//        llist.get(2) = Java~
        System.out.println("llist.get(2) = " + llist.get(2));

        /*cannot String + void*/
//        System.out.println("llist.push(\"Helooo~\" = " + llist.push("Helooo~");

//       void push() 等效于 void addFirst()
        llist.push("Helooo~");

//        llist = [Helooo~, wold, Hello, Java~]
        System.out.println("llist = " + llist);
//        E pop() == E addFirst(), 获取栈顶的元素.
        String pop = llist.pop();
        System.out.println("pop = " + pop);

    }
}
