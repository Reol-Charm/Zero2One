package cn.itcast.day04.loopexercise;
//编写一个java程序,求:13 - 23 + 33 - 43 +...+ 973 - 983 + 993 -1003的值.

public class LoopExeDemo021 {
    public static void main(String[] args) {
        int num = 13;
        int sum = 0;
//        for (int i = 0; i < 100; i++) {// 类似于数组索引, 但不同于数组索引.下标 从 1 开始.
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                sum += num;

            } else {
                sum -= num;
            }
            num += 10;

        }
        System.out.println("sum = " + sum);
    }
}
