package me.rekolcharm.combatexercise.apiofcommonlyusedclass.stringbuffer;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/7/29 20:44
 * @version: 1.0
 */

public class APIOfRuntime {
    public static void main(String[] args) {
        /*private constructor*/
        Runtime run = Runtime.getRuntime();
        /*maxMemory() & freeMemory() */
        System.out.println("run.maxMemory() = " + run.maxMemory());//1558183936
        System.out.println("run.freeMemory() = " + run.freeMemory());//94076152

        StringBuffer str = new StringBuffer().append("Hello world!");

        for (int i = 0; i < 10; i++) {
            str = str.append(i);
            System.out.println("str = " + str);

        }
        System.out.println("run.freeMemory() = " + run.freeMemory());

        /*gc();*/
        run.gc();

        System.out.println("run.freeMemory() = " + run.freeMemory());

    }
}
