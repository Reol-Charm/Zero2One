package cn.itcast.day14.oncourse;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/2 21:23
 * @version: 1.0
 */
/*接受多个参数, 且参数类型一致.*/
public class ChangeArgs {
    public static void main(String[] args) {
        int sum = show(1,3,34,43,34,34,3,343,25,23);
        System.out.println("show() = " + sum);
    }

    private static int show(/*等同于int[] e*/int...e) {
        int sum = 0;
        for (int a : e) {
            sum += a;
        }
        /*
        for (int i = 0; i < ; i++) {

        }*/
        return sum;
    }

}
