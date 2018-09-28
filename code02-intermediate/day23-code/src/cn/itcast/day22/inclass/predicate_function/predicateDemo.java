package cn.itcast.day22.inclass.predicate_function;

import java.util.function.Predicate;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/19 16:50
 * @version: 1.0
 * <p>
 * /**
 * java.util.function.Predicate<T>接口
 * 作用:对某种数据类型的数据进行判断,结果返回一个boolean值
 * <p>
 * Predicate接口中包含一个抽象方法：
 * boolean test(T t):用来对指定数据类型数据进行判断的方法
 * 结果:
 * 符合条件,返回true
 * 不符合条件,返回false
 */
public class predicateDemo {
    public static void main(String[] args) {
//        boolean doTest = doTest01("Hello lambda", (s) -> {
//            return s.length() > 15;
//        });
        System.out.println(doTest01("Hello lambda", (s) -> s.length() > 15));

    }

    /**
     * 定义一个方法
     * 参数传递一个String类型的字符串
     * 传递一个Predicate接口,泛型使用String
     * 使用Predicate中的方法test对字符串进行判断,并把判断的结果返回
     */
    private static boolean doTest01(String s, Predicate<String> pre1) {
        return pre1.test(s);
    }
}
