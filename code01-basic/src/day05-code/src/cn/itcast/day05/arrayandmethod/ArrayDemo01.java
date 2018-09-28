package cn.itcast.day05.arrayandmethod;

public class ArrayDemo01 {
    public static void main(String[] args) {
        /*1.数组的定义以及初始化方式
         * 2.利用角标索引获取数组各个元素
         * 3.数组的默认值
         * */
        int[] array01 = new int[3];
        int[] array02 = new int[]{1, 123, 33, 32};
        double[] array03 = new double[]{0.3, 0.4, 55, 23};

//        double[] array04 = new int[] {0.3, 0.4, 55, 23};
        /*向*/
        String[] str = {"Hello", "Java"};
        System.out.println(str);
        System.out.println("==========");

//        标准模式的动静态初始化细致写法
        /*int[] array012;
        array012 = null;
        array012[2] = 3;
        System.out.println(array012[2]);//NollPointerException*/
        double[] array022;
        array022 = new double[4];
        array022[3] = 0.332;
        System.out.println(array022[3]);
    }
}