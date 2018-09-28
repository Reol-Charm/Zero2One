package cn.itcast.day04.loopexercise;

public class LoopExeDemo02 {
    //编写一个java程序,求:13 - 23 + 33 - 43 +...+ 973 - 983 + 993 -1003的值.
    public static void main(String[] args) {
        int num = 13;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {//i = 0 ; 就多算了一个
            if(i % 2 == 0) {
                sum -= num;
            } else {
                sum += num;
            }
            num += 10;
            if(num > 1003) {
                break;
            }
            System.out.println("i = " + i);
            System.out.println("sum = " + sum);
            System.out.println("num = " + num);
            System.out.println("---------------------------");
        }
        System.out.println(sum);
    }

}
