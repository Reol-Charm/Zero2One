package cn.itcast.day15.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/3 20:57
 * @version: 1.0
 */
/*二、有2个数组，第一个数组内容为：[黑龙江省,浙江省,江西省,广东省,福建省]，
               第二个数组内容为：[哈尔滨,杭州,南昌,广州,福州]，
			   将第一个数组元素作为 key，第二个数组元素作为 value 存储到 Map 集合中。

			   如{黑龙江省=哈尔滨, 浙江省=杭州, …}。
     使用两种方式遍历map集合 */

public class Test02 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        String[] arr = {"黑龙江省", "浙江省", "江西省", "广东省", "福建省"};
        String[] arr1 = {"哈尔滨", "杭州", "南昌", "广州", "福州"};
        for (int i = 0; i < arr.length; i++) {
                map.put(arr[i], arr1[i]);
//            for (int j = 0; j < arr1.length; j++) {       // 错误❌:key = 福建省	value = 福州
//                map.put(arr[i], arr1[j]);
//            }
        }
        /*for (String s : arr) {
            for (String s1 : arr1) {
                map.put(s,s1);
            }
        }*/

        System.out.println("map = " + map);

        /*1.keyset()*/
        Set<String> keySet = map.keySet();
        for (String s : keySet) {
            String value = map.get(s);
            System.out.print("s = " + s + "\t");
            System.out.println("value = " + value);
        }
        System.out.println("------------------------------");

        /*2.entrySet()*/
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.print("key = " + key + "\t");
            System.out.println("value = " + value);
        }


    }

}
