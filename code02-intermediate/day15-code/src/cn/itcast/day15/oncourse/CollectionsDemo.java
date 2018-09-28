package cn.itcast.day15.oncourse;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/2 23:36
 * @version: 1.0
 */

public class CollectionsDemo {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("黑猫", 1.0);
        map.put("白猫", 2.0);
        System.out.println("map = " + map);
//        1.0:
        System.out.println("map.put(\"黑猫\", 1.0) = " + map.put("黑猫", 1.0));
//        1.0
        System.out.println("map.put(\"黑猫\", 1.0) = " + map.put("黑猫", 3. ));
//        3.0黑猫已经存在, 返回被替代的值.
        System.out.println("map.put(\"黑猫\", 1.0) = " + map.put("黑猫", 2.0));
//          map.put("花猫", 1.0) = null
        System.out.println("map.put(\"花猫\", 1.0) = " + map.put("花猫", 1.0));
        /*map = {白猫=2.0, 黑猫=2.0, 花猫=1.0}
        * map.remove("黑猫") = 2.0*/
        System.out.println("map = " + map);
        System.out.println("map.remove(\"黑猫\") = " + map.remove("黑猫"));
    }

}
