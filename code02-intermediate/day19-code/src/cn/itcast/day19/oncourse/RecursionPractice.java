package cn.itcast.day19.oncourse;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/11 16:06
 * @version: 1.0
 */

public class RecursionPractice {
    public static void main(String[] args) {
        System.out.println(numCompute(4));;
    }
// 1, 1, 2, 3, 5, 8
    private static int numCompute(int i) {
        if (i == 2 || i == 1) {
            return 1;
        }
        return numCompute(i - 1) + numCompute(i - 2);
    }

}
