package cn.itcast.day22.inclass.predicate_function;

/**
 * @Author: Rekol
 * @CreateDate: 2018/8/19 20:59
 * @version: 1.0
 * <p>
 * @Description: java.util.function.Function<T       ,       R>接口用来根据一个类型的数据得到另一个类型的数据，
 * 前者称为前置条件，后者称为后置条件。
 * Function接口中最主要的抽象方法为：R apply(T t)，根据类型T的参数获取类型R的结果。
 * 使用的场景例如：将String类型转换为Integer类型。
 */

import java.util.function.Function;

/**
 * 定义一个方法
 * 方法的参数传递一个字符串类型的整数
 * 方法的参数传递一个Function接口,泛型使用<String,Integer>
 * 使用Function接口中的方法apply,把字符串类型的整数,转换为Integer类型的整数
 */
public class FunctionDemo {
    public static void main(String[] args) {
        Integer change = change("123", (String num) -> {
            /*//自动拆箱 Integer->int*/
            int i = Integer.parseInt(num);
            return i;
        });
        System.out.println(change);
    }

    private static Integer change(String num, Function<String, Integer> fun) {
        Integer integer = fun.apply(num);
        return integer;
    }

}
