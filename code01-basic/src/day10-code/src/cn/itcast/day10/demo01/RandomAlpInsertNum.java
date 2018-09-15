package cn.itcast.day10.demo01;
/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/21 8:50
 * @version:         1.0
 *
 */

import java.util.Random;
import java.util.Scanner;

public class RandomAlpInsertNum {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(10);
        Scanner sc = new Scanner(System.in);
        System.out.println("please input the str.length(): ");
        int strLength = sc.nextInt();

        String str = "";
//      生成随机数字基于字符串长度长度的索引值, 方便插入. 最后一位也是string.size() - 1.
        int index = r.nextInt(strLength);

        for (int i = 0; i < strLength; i++) {

            int alpNum = r.nextInt(26) + 65;
            char alph = (char) alpNum;
            str += alph;
//          插入随机数
            if (index == i) {
                str += randomNum;
            }
        }
        System.out.println("str = " + str);
    }
}
