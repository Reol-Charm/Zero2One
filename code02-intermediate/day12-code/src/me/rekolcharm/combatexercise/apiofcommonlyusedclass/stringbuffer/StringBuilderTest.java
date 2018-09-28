package me.rekolcharm.combatexercise.apiofcommonlyusedclass.stringbuffer;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/7/30 16:37
 * @version: 1.0
 */

public class StringBuilderTest {
    public static void main(String[] args) {
        String str = "Hello" + " World!";
        convert(str);
    }

    private static void convert(String str) {
        StringBuilder sb = new StringBuilder(str);
        System.out.println("StringBuilder sb = " + sb);


    }

}
