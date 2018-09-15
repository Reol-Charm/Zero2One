package cn.itcast.day24_Stream.homework;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/22 19:18 - 30 - 56(a) - 11(b);
 * @version: 1.0
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/**
 * 1.	使用lambda表达式分别将以下功能 封装到Function对象中
 * a)	求Integer类型ArrayList中所有元素的平均数
 * b)	将Map<String,Integer>中value存到ArrayList<Integer>中
 * 2.	已知学生成绩如下
 * 姓名	成绩
 * 岑小村	59
 * 谷天洛	82
 * 渣渣辉	98
 * 蓝小月	65
 * 皮几万	70
 * 3.	以学生姓名为key成绩为value创建集合并存储数据，使用刚刚创建的Function对象求学生的平均成绩
 */
/*压制警告*/
@SuppressWarnings("all")

public class Pratice02 {
    public static void main(String[] args) {
/** a)	求Integer类型ArrayList中所有元素的平均数
 */
        System.out.println("getAverage() = " + getAverage());
//        getAverage02() = cn.itcast.day24_Stream.homework.Pratice02$1@58ceff1  地址值.
//        System.out.println("getAverage02() = " + getAverage02());
        /**
         * 将目标集合传进方法中, 进行转换.
         */

        Integer apply = getAverage02().apply(getArrayList());
        System.out.println(apply);
/**  * b)	将Map<String,Integer>中value存到ArrayList<Integer>中*/
        ArrayList<Integer> integerArrayList = mapStore2ArrayList();
        mapStore2ArrayList01();


    }

    private static ArrayList<Integer> mapStore2ArrayList() {
        ArrayList<Integer> lists = new ArrayList<>();
        Function<Map<String, Integer>, ArrayList<Integer>> fun3
                = new Function<Map<String, Integer>, ArrayList<Integer>>() {
            @Override
            public ArrayList<Integer> apply(Map<String, Integer> stringIntegerMap) {
                Map<String, Integer> map = new HashMap<>();
                ArrayList<Integer> list = new ArrayList<>();


                Set<String> stringSet = map.keySet();
                for (String key : stringSet) {
                    Integer value = map.get(key);
                    /*遍历将 value 添加进list 中*/
                    list.add(value);
                }
                /*将转换来的 list 存进容器 lists 中, 方便方法返回转换的list.*/
                lists.addAll(list);
                /*将 map 转换成了 list*/
                return list;
            }
        };
        return lists;
    }

    private static ArrayList<Integer> mapStore2ArrayList01() {
        ArrayList<Integer> lists = new ArrayList<>();
        Function<Map<String, Integer>, ArrayList<Integer>> fun3
                = (Map<String, Integer> stringIntegerMap) -> {

            Map<String, Integer> map = new HashMap<>();
            ArrayList<Integer> list = new ArrayList<>();

            /*将转换来的 value集合 存进容器 lists 中, 方便方法返回转换后的list.*/
            lists.addAll(stringIntegerMap.values());
            /*将 map 转换成了 list*/
            return list;
        };
        return lists;
    }


    /**
     * 将转换步骤封装到方法中
     */
    private static Function<ArrayList<Integer>, Integer> getAverage02() {

        Function<ArrayList<Integer>, Integer> fun01 = new Function<>() {
            //            @Override
//            public Object apply(Object o) {
//                return null;
//            }
            @Override
            public Integer apply(ArrayList<Integer> list) {
                int sum = 0;
                for (Integer i : getArrayList()) {
                    sum += i;
                }
                Integer i = sum / getArrayList().size();
                return i;
            }
        };
        /* 将转换步骤封装到方法中*/
        Function<ArrayList<Integer>, Integer> fun02 = list -> {
            int sum = 0;
            for (Integer i : getArrayList()) {
                sum += i;
            }
            Integer i = sum / getArrayList().size();
            return i;
        };
        return fun01;
    }

    private static Integer getAverage() {
        int sum = 0;
        for (Integer i : getArrayList()) {
            sum += i;
        }
        Integer i = sum / getArrayList().size();
        return i;
    }

    private static ArrayList<Integer> getArrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(59);
        list.add(82);
        list.add(98);
        list.add(65);
        list.add(70);
        return list;
    }
}
