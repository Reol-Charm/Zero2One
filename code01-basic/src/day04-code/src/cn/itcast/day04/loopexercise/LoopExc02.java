package cn.itcast.day04.loopexercise;

public class LoopExc02 {
    public static void main(String[] args) {
        getShape();
    }

    public static void getShape() {
        int count = 0;
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < 4 + i; j++) {

                count++;
                if (count % 2 == 0) {
                    System.out.println("*");
                }
                System.out.print(" ");

            }
        }
    }
}
