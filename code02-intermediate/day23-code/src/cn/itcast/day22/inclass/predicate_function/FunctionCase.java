package cn.itcast.day22.inclass.predicate_function;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/19 21:25
 * @version: 1.0
 */

import java.util.function.Function;

/**
 * 练习：自定义函数模型拼接
 * 题目
 * 请使用Function进行函数模型的拼接，按照顺序需要执行的多个函数操作为：
 * String str = "赵丽颖,20";
 * <p>
 * 分析:
 * 1. 将字符串截取数字年龄部分，得到字符串；
 * Function<String,String> "赵丽颖,20"->"20"
 * 2. 将上一步的字符串转换成为int类型的数字；
 * Function<String,Integer> "20"->20
 * 3. 将上一步的int数字累加100，得到结果int数字。
 * Function<Integer,Integer> 20->120
 */

public class FunctionCase {
    public static void main(String[] args) {
        String str = "赵丽颖,20";
        /*1. String 2 String*/
        String append = append(str, (String str1) -> {
            String age = str1.split(",")[1];
            return age;
            /*2. String 2 Integer*/
        }, (String str2) -> {
            return Integer.parseInt(str2) + 100;
            /*3. Integer 2 String*/
        }, (Integer str3) -> {
            return str.split(",")[0] + ": " + str3;
        });
//        append = 赵丽颖: 120
        System.out.println("append = " + append);
    }

    public static String append(String src, Function<String, String> fun1,
                                Function<String, Integer> fun2,
                                Function<Integer, String> fun3) {
        return fun1.andThen(fun2).andThen(fun3).apply(src);
    }
}
