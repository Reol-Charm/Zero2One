package cn.itcast.day04.loopexercise;
/*
计算 1+1/2!+1/3!+1/4!+...1/20!=?*/

public class FactorialDemo02 {
    public static void main(String[] args) {
        double sum = getEachNumber(20);
        System.out.println(sum);
    }

    public static int getFactorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static double getEachNumber(int range) {
        double EachNumber = 1;
        double sum = 0;
        for (int i = 1; i <= range; i++) {
//            EachNumber = 1 / getFactorial(range);
            EachNumber = 1 / getFactorial(i);

            sum += EachNumber;
        }
        return EachNumber;
    }

//    public static double getSum(int num) {
//        double sum = 0;
//        for (int i = 1; i < num + 1; i++) {
//            sum += getEachNumber(i);
//        }
//        return sum;
//    }
}
