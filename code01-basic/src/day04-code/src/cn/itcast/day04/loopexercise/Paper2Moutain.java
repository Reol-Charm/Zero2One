package cn.itcast.day04.loopexercise;

/*A piece of paper has o.o2cm height, and the Mountain Everest is 8848m,
how many folds makes paper's height match the others'?
* */
public class Paper2Moutain {

    public static void main(String[] args) {
        System.out.println(getCount());
    }

    public static int getCount() {
        double paper = 0.02;
        double target = 8848 * 100;
        int count = 0;
        while (paper <= target) {
            paper *= 2;
            count++;
        }
        return count;
//        int count = 0;

    }

}
