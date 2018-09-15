package cn.itcast.day08.string;

/**
 * @Description:     ArrayToString
 * @Author: Rekol
 * @CreateDate: 2018/7/18 14:55
 * @version: 1.0
 */

public class ArrayToString {
    public static void main(String[] args) {
        int[] arr = {23, 323, 34, 45, 65};
        String result = toString(arr);
        System.out.println("result = " + result);
    }

    public static String toString(int[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                str += "word" + arr[i] + "]";
                return str;
            } else {
                str += "word" + arr[i] + "#";
            }
        }
        return str;
    }
}
