package cn.itcast.day07.random;

import java.util.Random;

/**
 * @Description: 往随机四个字符串, 例如SJAS中, 随机插入[1, 10]的随机数
 * @Author: Rekol
 * @CreateDate: 2018/7/16 15:47
 * @version: 1.0
 *
 */

/**1. 随机字符A-Z, 对应char[65,90]
 * 2. 生成格式是一排,连接在一起的
 * 3. 随机数[1,10], 随机数的索引范围是:[0,4]
 * */

/**
 * 1. 5个字母的索引值是[0,4]
 * 2. 在什么位置添加数字是随机. 数字索引值也是[0,4]
 */
public class RandomAdditionalPlus {
    public static void main(String[] args) {
/**获取随机数*/
        Random r = new Random();
        int randomNum = r.nextInt(10);
        int index = r.nextInt(5);

        String str = "";

        for (int i = 0; i < 5; i++) {

            int alpNum = r.nextInt(26) + 65;
            char alph = (char) alpNum;
            str += alph;

            if (index == i) {
                str += randomNum;
            }
        }
        System.out.println("str = " + str);
    }
}
