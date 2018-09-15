package cn.itcast.day14.oncourse;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/2 20:37
 * @version: 1.0
 */

import java.util.HashSet;

/**
 * MethodOfHashSet
 * 无序, 不可重复.
 */
public class MethodOfHashSet {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add(new String("cba"));
        set.add("cba");
        set.add("bac");
//          i = cba
//          i = bac
        for (String i : set) {
            System.out.println("i = " + i.toString());
        }



    }
}
