package cn.itcast.day14.oncourse;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @Description: LinkedHashSet 有序不重复.
 * @Author: Rekol
 * @CreateDate: 2018/8/2 21:17
 * @version: 1.0
 */

public class MethodOfLinkedHashSet {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("avv");
        set.add("abc");
        set.add("bcc");
        set.add("bcc");
//      todo 回看视频, 熟悉迭代器的初略原理
        Iterator it = set.iterator();
        while(it.hasNext()) {
            System.out.println("it.next() = " + it.next());
        }

    }

}
