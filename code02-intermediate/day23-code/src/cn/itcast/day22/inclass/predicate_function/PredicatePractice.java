package cn.itcast.day22.inclass.predicate_function;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/19 19:33
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
public class PredicatePractice {
    public static void main(String[] args) {
        String[] array = {"迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女"};
//      filter = [迪丽热巴,女, 古力娜扎,女]
        ArrayList<String> filter = fliter(array, (String s) -> {
            return s.split(",")[0].length() == 4;
        }, (String s) -> {
            return "女".equals(s.split(",")[1]);
        });
        System.out.println("filter = " + filter);
//    Wrong!
//         String[] split = s.split(",");
//        String s1 = split[0];
//        if (s1.length() == 4) {
//            list.add(s1);
//        }
//        String s2 = split[1];
//        if ("女".equals(s2)) {
//            list.add(s2);
//        }
    }

    /**
     * 请通过Predicate接口的拼装将符合要求的字符串筛选到集合ArrayList中，
     * <p>
     */
    private static ArrayList<String> fliter(String[] arr, Predicate<String> pre1, Predicate<String> pre2) {
        /*1. 创建容器, 方便存储合乎要求的 元素.*/
        ArrayList<String> list = new ArrayList<>();
        /*2. 遍历数组, 完成条件筛选.*/
        for (String s : arr) {
            /*2. 设置并且筛选*/
            boolean b = pre1.and(pre2).test(s);
            /*3. 条件成立,两个条件都满足,把信息存储到ArrayList集合中*/
            if (b) {
                list.add(s);
            }
        }
        return list;

    }
}
