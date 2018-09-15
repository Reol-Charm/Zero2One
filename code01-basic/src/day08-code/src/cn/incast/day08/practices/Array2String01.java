package cn.incast.day08.practices;

import java.util.Arrays;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/7/18 15:24
 * @version: 1.0
 */

public class Array2String01 {
    public static void main(String[] args) {
        int[] a = {12, 213, 232, 232, 324, 564, 544, 464};
        String storeS = arr2Str(a);
        System.out.println("storeS = " + storeS);
    }

    public static String arr2Str(int[] a) {
        String s = new String("[");
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
//                s += s.concat(arr[i]);                    Wrong !
                s += s.concat(Arrays.toString(a)); //         调用Arrays工具包
//                s +="word" + a[i] + "]";

            } else {
                s += "Hello" + a[i] + "#";
            }
        }
        return s;
    }
}
