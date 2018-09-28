package papare4exam.javeee15secondexam.test01;
/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/23 15:24 - 17:20
 * @version:         1.0
 *
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 定义一个长度为5的int型数组arr，数组元素为1-99（范围包含1和99）之间的随机数
 * 提示用户输入2-5之间的一个数字num（num范围包括2和5,不需要代码判断）
 * 遍历数组arr,筛选出数组中元素是num倍数的数组元素并输出
 */
public class Test01 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random r = new Random();


        for (int i = 0; i < arr.length; i++) {
            int rad = r.nextInt(99) + 1;
            arr[i] = rad;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("-------------------");

        Scanner sc = new Scanner(System.in);
        System.out.println("input your num(2-5)");
        int num = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % num == 0) {
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}
