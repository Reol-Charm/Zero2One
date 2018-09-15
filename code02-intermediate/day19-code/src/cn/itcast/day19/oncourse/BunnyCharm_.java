package cn.itcast.day19.oncourse;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/12 10:33
 * @version: 1.0
 */

public class BunnyCharm_ {
    public static void main(String[] args) {
        bunny(5);
    }

    /*wrong!!*/
    private static int bunny(int bunnyNum) {
        /*记录 24 月*/
        int count = 0;
        while (++count < 25) {
            if (bunnyNum == 1 || bunnyNum == 2) {
                return bunnyNum = 1;
            }

            return bunny(bunnyNum - 1)
                    + bunny(bunnyNum - 2);
        }
        return bunnyNum;
    }


}
