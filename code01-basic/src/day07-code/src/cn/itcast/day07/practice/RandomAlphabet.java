package cn.itcast.day07.practice;

import java.util.Random;

/**
 * @Description: generate random alphabet.
 * @Author: Rekol
 * @CreateDate: 2018/7/16 20:28
 * @version: 1.0
 */
/* 1. generate number in [65, 90]
 * 2. char
 * 3. loop*/
class RandomNum {
    Random r = new Random();


    public int getrandomNum() {
        int storerandomNum = 0;
        String storeString = "";
        for (int i = 0; i < 5; i++) {
            int num = r.nextInt(26) + 65;
            storerandomNum = num;
            char chars = (char) storerandomNum;
            storeString += chars;
            System.out.println("num = " + num);
            System.out.println("chars = " + chars);
            System.out.println("storeString = " + storeString);
        }
        return storerandomNum;
    }
}

/*class RandomAlp{
    RandomNum rn = new RandomNum();
    public void getRandomAlphabet() {
       int storerandomNum2 = rn.getrandomNum();
       char chars = (char)storerandomNum2;
        System.out.println("chars = " + chars);
    }
}*/

public class RandomAlphabet {
    public static void main(String[] args) {
        RandomNum rn = new RandomNum();
//        RandomAlp ra = new RandomAlp();

        rn.getrandomNum();
        System.out.println("------------------");
//        ra.getRandomAlphabet();
    }

}
/*总结:
1.不明确需求, 即要完成什么样式的结果
2. 空想主义, 思绪不连贯.
* */