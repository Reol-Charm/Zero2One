package cn.itcast.day05.arraywithfor;

public class ArrayAndMethod {
    public static void main(String[] args) {
        double[] arr = new double[]{2.33, 3434, 343.434, 345.46, 5456.756, 5645, 657};
//        - 声明新的数组存储方法返回的数组.
//                - 新的数组元素 与 返回的数组元素元素无关系.
//调用方法求出数组内元素的和,以及平均数
        double[] newArray = getCalculate(2.33, 3434, 343.434, 345.46, 5456.756, 5645, 657);
        System.out.println("======================");
        for (double a :
                newArray) {
        System.out.println(a);

        }
    }

//    public static double[] getResult(double[] cases) {
        /*double sum = 0;
        for (int i = 0; i < cases.length - 1; i++) {
            sum += cases[i];

            cases[i] = sum;
        }
        for ( double a : cases) {
            System.out.println(a);
        }
        return cases ;*/

//        sadness...
//    The new array wanna: one element is the sum of the first two element.
//    Generating a new array, and it's elements come from the old one's two element close.

        /*for (int i = 0; i < cases.length - 2; i++) {
            double sum = cases[i] + cases[i + 1];
            double[] newcases = {sum};
            for (double b :
                    newcases) {
                System.out.println(b);
                System.out.println("****************");
            }
        }
        return cases;*/


//    }

    public static int[] calculate(int a, int b, int c) {
        int sum = a + b + c; // 总和
        int avg = sum / 3; // 平均数
        // 两个结果都希望进行返回

        // 需要一个数组，也就是一个塑料兜，数组可以保存多个结果
        /*
        int[] array = new int[2];
        array[0] = sum; // 总和
        array[1] = avg; // 平均数
        */

        int[] array = {sum, avg};
        System.out.println("calculate方法内部数组是：");
        System.out.println(array); // 地址值
        return array;

    }

    public static double[] getCalculate(double a, double b, double c, double e, double f, double g, double j) {
        double sum = a + b + c + e + f + g + j;
        double avg = sum / 7;
        double[] arr = {sum, avg, };
        return arr;
    }
}
