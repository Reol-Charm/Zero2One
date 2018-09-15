package cn.itcast.day04.loopexercise;

public class LoopExeDemo020 {
    public static void main(String[] args) {
        // write your code here
//编写一个java程序,求:13 - 23 + 33 - 43 +...+ 973 - 983 + 993 -1003的值.
        int sum = 0;
        int i = 13;
        for (int j = 1; j <= 1000; j++) {
            /*奇数?位相加, 偶数位相减*/
            if (j % 2 == 1) {
                sum += i;
            } else {
                sum -= i;
            }
            System.out.println("当前sum的值是：" + sum);
            i += 10;
            if (i > 1003) {
                break;
            }
            System.out.println("i 的值是：" + i);
        }
        System.out.println("sum 的最终结果是：" + sum);
    }
}
