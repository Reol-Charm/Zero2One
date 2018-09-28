package cn.itcast.day15.oncourse;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/4 12:01
 * @version: 1.0
 */
/*九、利用Map，完成下面的功能：
从命令行读入一个字符串，表示一个年份，输出该年的世界杯冠军是哪支球队。如果该 年没有举办世界杯，则输出：没有举办世界杯。
//tips:参阅Map接口containsKey(Object key)方法
*/
/*flow:
 * 1. Map<S听,String> 集合, put(key, value)
 * 2. 是否输入的年份是否存在,
 * 3. */
public class Pratice09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.println("请输入要查询的年份: ");
////        todo<新功能>: 对输入的 year 进行筛选规范.
//        int year = sc.nextInt();
//        judge(year, hashMap());

//        System.out.println("请输入国家名称: ");
//        String nation = sc.next();
//        splitNation(nation, hashMap());

        System.out.println("请输入国家名称: ");
        String nation1 = sc.next();
        another(nation1, hashMap());

    }

    private static void another(String nation, HashMap<Integer, String> hashMap) {
        /*如果 map 的 value 值有 nation 时, 这时才遍历 map ,并且判断 如果输入的值和 value 相等*/
        if (hashMap.containsValue(nation)) {
            /*keySet() 集合 遍历得出 value 与 输入值 对比判断, 否则, 总是输出 全部 value */
            for (Integer value : hashMap.keySet()) {
                if (hashMap.get(value).equals(nation)) {
                    System.out.println(value + "\t");
                }
            }
        } else {
            System.out.println("没有获得过世界杯");
        }

    }

    private static void splitNation(String nation, HashMap<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            String value = entry.getValue();

            /*输入的值 与 获取的 value 进行对比, */
            /*map 集合中是否有 nation 值, */
            if (map.containsValue(nation) && value.equals(nation)) {

                System.out.print(entry.getKey() + "\t");

            } else if (!map.containsValue(nation)) {
                System.out.println("没有获得过世界杯");
            }
        }

    }


    /*十、在原有世界杯Map 的基础上，增加如下功能：
    读入一支球队的名字，输出该球队夺冠的年份列表。
    例如，读入“巴西”，应当输出 1958 1962 1970 1994 2002
         读入“荷兰”，应当输出 没有获得过世界杯
//tips:参阅Map接口containsValue(Object value)方法
*/


    private static void judge(int year, HashMap<Integer, String> map) {
//         * 2. 判断 是否输入的年份是否存在,
        if (map.containsKey(year)) {
            System.out.println(year + "年, 获得世界杯冠军的是: " + map.get(year));
        } else {
            System.out.println("该年没有举办世界杯.");
        }
    }

    private static HashMap<Integer, String> hashMap() {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1930, "乌拉圭");
        map.put(1934, "意大利");
        map.put(1938, "意大利");
        map.put(1950, "乌拉圭");
        map.put(1954, "西德");
        map.put(1958, "巴西");
        map.put(1962, "巴西");
        map.put(1966, "英格兰");
        map.put(1970, "巴西");
        map.put(1974, "西德");
        map.put(1978, "阿根廷");
        map.put(1982, "意大利");
        map.put(1986, "阿根廷");
        map.put(1990, "西德");
        map.put(1994, "巴西");
        map.put(1998, "法国");
        map.put(2002, "巴西");
        map.put(2006, "意大利");
        map.put(2010, "西班牙");
        map.put(2014, "德国");

        return map;
    }
}
