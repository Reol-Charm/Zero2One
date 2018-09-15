package cn.itcast.day22.inclass.predicate_function;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/19 17:23
 * @version: 1.0
 */

import java.util.function.Predicate;

/**
 * 逻辑表达式:可以连接多个判断的条件
 * &&:与运算符,有false则false
 * ||:或运算符,有true则true
 * !:非(取反)运算符,非真则假,非假则真
 * <p>
 * 需求:判断一个字符串,有两个判断的条件
 * 1.判断字符串的长度是否大于5
 * 2.判断字符串中是否z包含a
 * 两个条件必须同时满足,我们就可以使用&&运算符连接两个条件
 * <p>
 * Predicate接口中有一个方法and,表示并且关系,也可以用于连接两个判断条件
 * default Predicate<T> and(Predicate<? super T> other) {
 * Objects.requireNonNull(other);
 * return (t) -> this.test(t) && other.test(t);
 * }
 * 方法内部的两个判断条件,也是使用&&运算符连接起来的
 */
public class Predicate02 {
    /**定义一个方法,方法的参数,传递一个字符串
    传递两个Predicate接口
    一个用于判断字符串的长度是否大于5
    一个用于判断字符串中是否包含a
    两个条件必须同时满足
    */
    public static void main(String[] args) {

//        String str = new String("Hello?"
//                /*new byte[]{'H', 'e', 'l', 'l', 'o', '!'}, 0, 4*/);

        String str = "Hello?";
        boolean and = getAnd(str, (String string1) -> string1.length() > 0,
//             @Wrong!   "e".contains(string2)
//                "e".equals(string2)
                string2 -> string2.contains("e"));
        System.out.println("and = " + and);

        boolean or = getOr(str, string03 -> "H".equals(string03),
                string04 -> string04.length() < 3);
        System.out.println("getOr = " + or);
    }

    private static boolean getAnd(String str, Predicate<String> pre1, Predicate<String> pre2) {
        return pre1.and(pre2).test(str);
    }

    private static boolean getOr(String str, Predicate<String> pre1, Predicate<String> pre2) {
        return pre1.or(pre2).test(str);
    }
}
