package cn.itcast.day13.oncourse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/7/31 10:50
 * @version: 1.0
 */

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> colle = new ArrayList<String>();
        Iterator<String> iterator = colle.iterator();
        while (iterator.hasNext()) {
            System.out.println("iterator = " + iterator.next());
        }
    }

}
