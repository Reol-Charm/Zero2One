package cn.itcast.day04.loopexercise;
//编写一个java程序,求:13 - 23 + 33 - 43 +...+ 973 - 983 + 993 -1003的值.

public class LoopExeDemo0123 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 13, j = 1; i < 1013; i += 10, j++) {
            if (j % 2 == 1) {
                sum += i;
            } else {
                sum -= i;
            }
            System.out.println("i = " + i);
            System.out.println("sum = " + sum);
            System.out.println("j = " + j);
            System.out.println("-----------------------");
        }
        System.out.println("sum = " + sum);
    }
}
/*总结:
*  1. 不足之处: 还是不理解sum -= i;
*  2. sum += i; 和 sum -= i;的组合运用.
*
*
*
*
*  */
