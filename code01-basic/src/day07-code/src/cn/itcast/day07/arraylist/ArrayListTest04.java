package cn.itcast.day07.arraylist;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Description:调用方法对原始集合元素进行筛选
 * @Author: Rekol
 * @CreateDate: 2018/7/16 17:08
 * @version: 1.0
 */

public class ArrayListTest04 {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        Random r = new Random();
        /*将随机数存储进整数包装型集合中.*/
        for (int i = 0; i < 20; i++) {
            int randomNum = r.nextInt(20) + 1;
            intList.add(randomNum);
        }
        //Declare a new variable to store the return.
        ArrayList<Integer> evenList = getArrayList(intList);
        for (int i = 0; i < evenList.size(); i++) {
            System.out.println(evenList.get(i));
        }
    }

    //return type: arraylist<Integer>
    public static ArrayList<Integer> getArrayList(ArrayList<Integer> a) {
        //instance the target arraylist<Integer>
        ArrayList<Integer> smallList = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) % 2 == 0) {
                smallList.add(a.get(i));
            }
        }
        return smallList;

    }
}
