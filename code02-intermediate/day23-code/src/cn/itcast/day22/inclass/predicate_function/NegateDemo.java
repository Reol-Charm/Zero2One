package cn.itcast.day22.inclass.predicate_function;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/19 19:09
 * @version: 1.0
 */

import java.util.function.Predicate;


/**
 * 需求:判断一个字符串长度是否大于5
 * 如果字符串的长度大于5,那返回false
 * 如果字符串的长度不大于5,那么返回true
 * 所以我们可以使用取反符号!对判断的结果进行取反
 * <p>
 * Predicate接口中有一个方法negate,也表示取反的意思
 * default Predicate<T> negate() {
 * return (t) -> !test(t);
 * }
 */
public class NegateDemo {
    public static void main(String[] args) {
        String s = "Hello? Predicate!";
        Boolean b = s.contains("= ");
        /*将 b 作为参数传入同为参数的 Predicate 函数接口中 b, 将其进行取反.*/
        Boolean aBoolean = negateTest(b, (boolean1) -> boolean1);
        System.out.println("aBoolean = " + aBoolean);
    }

    private static Boolean negateTest(Boolean b, Predicate<Boolean> b1) {
        return b1.negate().test(b);

    }

}
