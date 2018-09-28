package cn.itcast.day06.demo02;

import java.util.Arrays;

//[12, 23, 34, 45, 56, 56, 67, 78]
public class ArrayPrintToString {
    public static void main(String[] args) {
        int[] array = {12, 23, 34, 45, 56, 56, 67, 78};
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i] + "]");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("--------------------------------");
        System.out.println(Arrays.toString(array));

    }
}
