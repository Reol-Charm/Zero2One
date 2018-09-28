package cn.itcast.day05.arrayandmethod;

public class ArrayDemo03Max {
    public static void main(String[] args) {
        int[] array = {11, 123, 323, 333, 22, 4232};
        int max = array[0];//Assume the max is the first element of array[].
        int storeMax02 = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] > max) {
                max = array[i];
            }
//            int max02;
//            max02 = max > array[i] ? max : array[i];
            int max02 = max > array[i] ? max : array[i];
            storeMax02 = max02;
        }
        System.out.println(max);
        System.out.println("--------------");
        System.out.println("max02 = " + storeMax02);
    }
}
