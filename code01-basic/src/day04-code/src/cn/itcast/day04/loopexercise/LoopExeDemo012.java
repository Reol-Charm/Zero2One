package cn.itcast.day04.loopexercise;

public class LoopExeDemo012 {
    //编写一个java程序,求:13 - 23 + 33 - 43 +...+ 973 - 983 + 993 -1003的值.
    public static void main(String[] args) {
        int sum = 0;
        int dec = 0;
        int result;
        int count = 1;
        for (int i = 13; i < 1013; i += 10) {
            if (count % 2 == 0) {//引入计数器.
                dec -= i;
            } else {
                sum += i;
            }
            result = sum + dec;
            count++;
            System.out.println(result + " 此时,i 值为: " + i);
        }
        System.out.println("????");
    }
}
/*思路总结:
* 1. 还是计数器思想的运用.
* 2. 并辅以适当的题型规律总结.
* 3.
*
*
* */