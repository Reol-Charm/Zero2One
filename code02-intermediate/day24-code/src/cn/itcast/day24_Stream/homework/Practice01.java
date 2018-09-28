package cn.itcast.day24_Stream.homework;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/22 18:54 -19:15
 * @version: 1.0
 */

import java.util.function.Predicate;

/**
 * 1.	请在测试类main方法中完成以下需求
 * 已知有Integer[] arr = {-12345, 9999, 520, 0,-38,-7758520,941213}
 * a)	使用lambda表达式创建Predicate对象p1,p1能判断整数是否是自然数(大于等于0)
 * b)	使用lambda表达式创建Predicate对象p2,p2能判断整数的绝对值是否大于100
 * d)	使用lambda表达式创建Predicate对象p3,p3能判断整数是否是偶数
 * <p>
 * 遍历arr，仅利用已创建的Predicate对象(不使用任何逻辑运算符)，完成以下需求
 * i.	打印自然数的个数
 * ii.	打印负整数的个数
 * iii.	打印绝对值大于100的偶数的个数
 * iv.	打印是负整数或偶数的数的个数
 * Pre1.or(pre2).accept(Integer i)
 * (Maths.abs(Integer) > 100).and(Integer % 2 ==0).accept(Integer);
 * Boolean doPredicate(Integer, Predicate<Integer>){
 * * Return Integer >= 0;
 * Boolean doPredicate(Integer, Predicate<Integer>){
 * * Return Integer >= 0;
 */
public class Practice01 {
    public static void main(String[] args) {
        Integer[] arr = {-12345, 9999, 520, 0, -38, -7758520, 941213};
//        使用lambda表达式创建Predicate对象p1,p1能判断整数是否是自然数(大于等于0)
        Predicate<Integer> pre1 = (i -> i >= 0);
//        使用lambda表达式创建Predicate对象p2,p2能判断整数的绝对值是否大于100
        Predicate<Integer> pre2 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return Math.abs(integer) > 100;
            }
        };
//         使用lambda表达式创建Predicate对象p3,p3能判断整数是否是偶数
        Predicate<Integer> pre3 = ((Integer i) -> {
            return i % 2 == 0;
        });
//遍历arr，仅利用已创建的Predicate对象(不使用任何逻辑运算符)，完成以下需求
// * i.	    打印自然数的个数 pre1 --> 大于等于0
// * ii.	打印负整数的个数
// * iii.	打印绝对值大于100的偶数的个数pre2.pre4
// * iv.	打印是负整数或偶数的数的个数
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        for (Integer i : arr) {
            if (pre1.test(i)) {
                count1++;
            }
            if (pre1.negate().test(i)) {
                count2++;
            }

            if (pre2.and(pre3).test(i)) {
                count3++;
            }
            if (pre1.negate().or(pre3).test(i)) {
                count4++;
            }
        }
        System.out.println("count1 = " + count1);
        System.out.println("count2 = " + count2);
        System.out.println("count3 = " + count3);
        System.out.println("count4 = " + count4);

    }
}
