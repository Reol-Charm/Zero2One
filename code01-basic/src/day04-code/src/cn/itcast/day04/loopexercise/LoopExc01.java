package cn.itcast.day04.loopexercise;

public class LoopExc01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 4 + i; j++) {
                if (j <= 5 - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        for (int k = 1; k <= 5; k++) {
            for (int g = 1; g <= 9 - k; g++) {
                if (g <= k) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
