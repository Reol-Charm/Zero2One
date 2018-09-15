package cn.itcast.day05.arrayandmethod;

//1.定义一个用于存放班级分数的数组
//		int[] score = {80,90,85,90,78,88,89,93,98,75};
//	2.求出班级不及格人数(分数低于60分的就是不及格)
//	3.求出班级的平均分
//	4.求出班级的总分数
public class ArrayAndMethodExcercise {
    public static void main(String[] args) {
		int[] score = {80,90,85,90,78,58,89,93,98,75};
		double[] newArray = getArray(score);
        System.out.println("Underneath sentences are printed by getArray(). ");
        System.out.println(newArray[0]);
        System.out.println(newArray[1]);
//        System.out.println(newArray[2]);//ArrayAndMethodExcercise

    }

    public static double[] getArray(int[] arr) {
        int getElement;//定义一个容器,存储arr的元素
        int sum = 0;//定义一个容器, 存储arr[0] + ... + arr[arr.length - 1]
        int fial = 60;
        for (int i = 0; i < arr.length; i++) {
            getElement = arr[i];
            sum += getElement;
            /*if (getElement < fial) {
                System.out.println("不及格分数为: " + getElement );

            } else {
                System.out.println("都考试及格了");
            }*/
        }
        double getAvg = sum / arr.length;
        System.out.println(sum);
        System.out.println(getAvg);
        System.out.println("-----------------------");

        /*Excellent!*/
        double[] newArray = {sum, getAvg};
        /*Expand*/
        int sum02 = arr[0] + arr[1] + arr[2];
        int avg02 = sum02 / arr.length;
        return newArray;
    }

}
