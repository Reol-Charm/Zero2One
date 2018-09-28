package cn.itcast.day19.oncourse;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/12 10:49
 * @version: 1.0
 */

public class Bunny$$Charm {
    public static void main(String[] args) {

//        StackOverflowError
//        for (int i = 0; i < 24; i++) {
        /*1		1		2		3		5
8		13		21		34		55
89		144		233		377		610
987		1597		2584		4181		6765
10946		17711		28657		46368		*/
        for (int i = 1; i < 25; i++) {
            int bunnyNum = bunny(i);
            System.out.print(bunnyNum + "\t" + "\t");
            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }

    private static int bunny(int month) {
        /*记录 24 月*/
        if (month == 1 || month == 2) {
            return month = 1;
        }
        return bunny(month - 1)
                + bunny(month - 2);
    }
}
