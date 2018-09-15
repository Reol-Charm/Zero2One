package cn.itcast.day04.loopexercise;
/*计算 1+1/2!+1/3!+1/4!+...1/20!=?
* */
public class FactorialDemo01 {
    public static void main(String[] args) {
        int num = 1;
        double res = 1.00;
        double fin = 0;
        for (int i = 1; i <= 20; i++) {
            num *= i;
            res = 1 / num;
            fin += res;
        }
        System.out.println(fin);
    }
}
