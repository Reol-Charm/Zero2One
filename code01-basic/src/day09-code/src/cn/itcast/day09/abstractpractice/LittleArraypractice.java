package cn.itcast.day09.abstractpractice;

import java.util.ArrayList;

/*@Description:      0 - 100 之间的数, 每两个去除一个, 去除的最后一个数是多少?
 * @Author:          Rekol
 * @CreateDate:      2018/7/20 23:15 - 23:25 - 23:33
 * @version:         1.0
 *
 */
class Array {
    public void showList(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                list.add(arr[i]);
            }
        }
//        list.get(list.size() - 1);
        System.out.println("list.get(list.size() - 1) = " + list.get(list.size() - 1));
    }
}

public class LittleArraypractice {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {//101 outOfBoundException...
            arr[i] = i;
            System.out.println("arr[arr.length - 1] = " + arr[arr.length - 1]);
        }

        Array targetArr = new Array();
        targetArr.showList(arr);

    }

}
