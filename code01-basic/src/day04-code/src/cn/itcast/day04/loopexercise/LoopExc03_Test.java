package cn.itcast.day04.loopexercise;

public class LoopExc03_Test {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 5 + i; j++) {
                if (j <= 6 - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
        System.out.println();
        }
    }
}
