package cn.itcast.day04.loopexercise;

public class FactorialDemo03 {

    /**
     * 题目三：
     * 计算 1+1/2!+1/3!+1/4!+...1/20!=?
     * <p>
     * 阶乘  5阶乘  5*4*3*2*1
     */
    public static void main(String[] args) {

        double sum = getSum();
        System.out.println(sum);
    }

    public static double getSum() {
        double sum = 0;
        for (int i = 1; i <= 20; i++) {
            int jie = getJie(i);
            double num = 1.0 / jie;
            sum += num;
        }

        return sum;
    }


    public static int getJie(int num) {
        int sum = 1;
        for (int i = 1; i <= num; i++) {
            sum *= i;
        }

        return sum;
    }

}

