package papare4exam.javeee15secondexam.test01;
/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/23 15:52
 * @version:         1.0
 *
 */

import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {
        String[] arr = {"itcast", "itheima", "baitdu", "weixin", "zhifubao"};

        String[] storeArr = filter(arr, "it");
        System.out.println(Arrays.toString(storeArr));
    }


    public static String[] filter(String[] arr, String str) {
//        将数组中包含参数str的元素存入另一个String 数组中并返回
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].contains(str)) {
                count++;
            }
        }

        String[] str2 = new String[count];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].contains(str)) {
                str2[i] = arr[i];
            }
        }
        return str2;
    }
}