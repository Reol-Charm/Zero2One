package cn.itcast.day22.inclass.predicate_function;
/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/19 20:02
 * @version: 1.0
 */

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * 练习：集合信息筛选
 * 数组当中有多条“姓名+性别”的信息如下，
 * String[] array = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女" };
 * 请通过Predicate接口的拼装将符合要求的字符串筛选到集合ArrayList中，
 * 需要同时满足两个条件：
 * 1. 必须为女生；
 * 2. 姓名为4个字。
 * <p>
 * 分析:
 * 1.有两个判断条件,所以需要使用两个Predicate接口,对条件进行判断
 * 2.必须同时满足两个条件,所以可以使用and方法连接两个判断条件
 */
public class PredicatePra02 {
    public static void main(String[] args) {
        String[] array = {"迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女"};

        ArrayList<String> listAfterFilter = filter02(array, (String str) -> {
//            又被搞迷糊了...重看视频后, 对Predicate 接口有了更深的认识:
//            方法包装了判断条件 "&&", 并返回满足条件的 Arraylist, 所以我们需要做的就是自己写具体条件.
            return str.split(",")[0].length() == 4;
////            waste! 浪费了半个小时!.
//        }, (String str) -> "女".equals(str.split(",")[0]));
        }, (String str) -> "女".equals(str.split(",")[1]));

        System.out.println("listAfterFilter = " + listAfterFilter);
    }

    private static ArrayList<String> filter02(String[] arr, Predicate<String> pre1, Predicate<String> pre2) {
        ArrayList<String> list = new ArrayList<String>();
        for (String str : arr) {
            /*String str 两个条件都满足, str:"迪丽热巴,女"才会被添加到集合中*/
            boolean test = pre1.and(pre2).test(str);
            if (test) {
                list.add(str);
            }
        }
        return list;

    }

}
