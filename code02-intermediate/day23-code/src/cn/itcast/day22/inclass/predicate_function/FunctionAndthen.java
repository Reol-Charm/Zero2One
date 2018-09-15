package cn.itcast.day22.inclass.predicate_function;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/19 21:14 - 22
 * @version: 1.0
 */

import java.util.function.Function;

/**
 * Function接口中的默认方法andThen:用来进行组合操作
 * <p>
 * 需求:
 * 把String类型的"123",转换为Inteter类型,把转换后的结果加10
 * 把增加之后的Integer类型的数据,转换为String类型
 */
public class FunctionAndthen {
    public static void main(String[] args) {
        String srcNum = "334455";
        Boolean change = change(srcNum, (String str) -> {
            return Integer.parseInt(str);
        }, (Integer numAfterParse) -> {
            return numAfterParse % 5 == 0;
        });
        System.out.println("change = " + change);
    }

    /**
     * 1. 确定返回类型为Boolean
     */
    private static Boolean change(String src, Function<String, Integer> fun1, Function<Integer, Boolean> fun2) {
        /**2. 确定组合操作.*/
        Boolean aBoolean = fun1.andThen(fun2).apply(src);
        return aBoolean;
    }

}
