package cn.itcast.day04;

/**
 * 1.打印1到100之内的整数，但数字中包含9的要跳过
 * 2.每行输出5个满足条件的数，之间用空格分隔
 * 3.如：1 2 3 4 5
 */
public class NumberTest {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
//            if (i % 9 == 0 ) {
//                continue;
//            }
//            if (i > 10 && i < 100) {
//                if(i / 10 == 0) {
//                    continue;
//                }
//            }
//            count++;
//            count += i;
//            if (count % 5 == 0) {
//                System.out.print(" ");
//            }
//            System.out.print(i);
            /**
             * 1.打印1到100之内的整数，但数字中包含9的要跳过
             2.每行输出5个满足条件的数，之间用空格分隔
             3.如：1 2 3 4 5 */
            if (i < 10) {
                System.out.print(i);
                if (i % 10 == 9) {
                    count += i;
                    continue;
                }
                if (count % 5 == 0) {
                    System.out.print("\t");
                }
            }
            if (i > 10 && i % 10 == 9 || i / 10 % 9 == 0) {
                count += i;
                continue;
            }
            System.out.print(i);
            if (count % 5 == 0) {
                System.out.print("\t");
            }


//            if
//            if () {
////
////            }
        }
    }
}
