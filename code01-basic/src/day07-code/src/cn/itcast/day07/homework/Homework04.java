package cn.itcast.day07.homework;
/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/20 19:21
 * @version:         1.0
 *
 */

import java.util.ArrayList;

public class Homework04 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("def");
        list.add("def");
        list.add("ghi");
        list.add("def");
        list.add("hij");
        list.add("jkol");

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if ("def".equals(list.get(i))) {
                count++;
            }
        }
        System.out.println("count = " + count);
//        倒着删除, 不会出现少删除现象.
        for (int i =list.size() - 1; i >= 0; i--) {
            if("def".equals(list.get(i))){
                list.remove(i);
            }
        }
        System.out.println("list = " + list);
    }
}
