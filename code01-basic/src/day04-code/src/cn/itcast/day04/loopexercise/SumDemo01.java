package cn.itcast.day04.loopexercise;

//import java.util.scanner;

/*需求: 求0 - 100 的和.
求1 - 5 的factorial
* */
public class SumDemo01 {
    public static void main(String[] args) {
    sum(2);
    getFactorial(1, 5);
    }
   /* public static int sumInput(scanner s) {

    }*/
    public static void sum(int num) {
        int sum = 0;
        for (int i = num; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);//5049

    }
    public static void getFactorial(int a , int b) {
        int factorial = 1 ;
        for (int i = a; i <= b; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
