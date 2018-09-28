package me.rekolcharm.combatexercise.apiofobject;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/7/29 16:40 - 48 - 51
 * @version: 1.0
 */

public class ObjectReceiveArray {
    public static void main(String[] args) {
        int[] temp = {1, 23, 3, 4, 55, 56};
        Object objTemp = temp;
        //1	23	3	4	55	56
        print(objTemp);
        System.out.println();
        System.out.println("---------------");
        //same as objTemp.
        print(temp);

    }

    public static void print(Object o) {
        /*Judge the type of object*/
        if (o instanceof int[]) {
            /*downcast the object.*/
            int[] x = (int[]) o;

            for (int i = 0; i < x.length; i++) {
                System.out.print(x[i] + "\t");
            }
        }
    }
}
