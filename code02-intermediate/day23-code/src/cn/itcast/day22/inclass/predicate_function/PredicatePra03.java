package cn.itcast.day22.inclass.predicate_function;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/20 10:26
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
 * <p>
 * 重点: 请通过Predicate接口的拼装将符合要求的字符串筛选到集合ArrayList中，
 */
public class PredicatePra03 {
    public static void main(String[] args) {
        String[] array = {"迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女"};
        /*5. invoke the method, set the conditions manually.*/
/*lambda 中参数 String str1, 代表数组中的字符串元素.*/
        ArrayList<String> listGetFilter = listGetFilter(array, (String str1) -> {
            /*6. lambda 表达式 设置第一个条件, 返回值为 boolean*/
            return str1.split(",")[0].length() == 4;
        }, (String str2) -> {
            /*7. lambda 表达式 设置第一个条件, 返回值为 boolean*/
            return "女".equals(str2.split(",")[1]);
        });

        System.out.println("listGetFilter = " + listGetFilter);
    }

    private static ArrayList<String> listGetFilter(String[] arr,
                                                   Predicate<String> pre1,
            /*1. 创建待返回的容器集合*/              Predicate<String> pre2) {
        ArrayList<String> list = new ArrayList<>();
        /*2. 遍历传入数组, 设定筛选条件*/
        for (String s : arr) {
            /*3. 设定通用筛选条件: &&*/
            boolean test = pre1.and(pre2).test(s);
            /*4. 如果满足条件, 将数组中字符串添加进集合中*/
            /*这样集合中, 只有满足条件的字符串元素了.*/
            if (test) {
                list.add(s);
            }
        }
        return list;
    }

}
