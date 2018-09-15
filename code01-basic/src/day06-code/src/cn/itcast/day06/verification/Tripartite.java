package cn.itcast.day06.verification;

/**
 * @Description: 变量初始化的时候需要赋值才能参与运算
 * @Author: Rekol
 * @CreateDate: 2018/7/15 15:13
 * @version: 1.0
 */

public class Tripartite {
    public static void main(String[] args) {
        int x = 8, y;
        y = (x > 5) ? 100 : 200;
        System.out.println(y);
        int m = 8, n;
//        (x > 5) ? y = 100 : y = 200;变量初始化的时候需要赋值才能参与运算

        if (m > 5) n = 100;
        else n = 200;
        System.out.println(m);

    }
}
