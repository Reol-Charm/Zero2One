package cn.itcast.day08.string;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/7/18 11:53     luzhiming@itcast.cn
 * @version: 1.0
 */

public class Demo01 {
    public static void main(String[] args) {
        String email = "Rekol2333@163.com";
        String[] split = email.split("@");
        for (int i = 0; i < split.length; i++) {
            System.out.println("split[i] = " + split[i]);
        }
        System.out.println("split = " + split);

        String[] point = email.split("\\.");//正则表达式
        for (int i = 0; i < point.length; i++) {
            System.out.println("point[i] = " + point[i]);
        }
        System.out.println("point = " + point);
    }
}
