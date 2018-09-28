package cn.itcast.day05.arrayandmethod;

public class ArrayOverloadAndParameter {
    public static void main(String[] args) {
        int[] array = new int[9];
        String[] str = new String[]{"Hello", "World", "And", "Java"};
        boolean[] boo = {true, false};
        paramCase(str);
        System.out.println("------------------");
        paramCase(array);
        System.out.println("------------------");
        paramCase(boo);

    }

    public static boolean[] paramCase(boolean[] arr) {
        for (boolean b :
                arr) {
            System.out.println("PrintArray: " + b);
        }
        return arr;
    }

    public static int[] paramCase(int[] arr) {
        for (int b :
                arr) {
            System.out.println("PrintArray: " + b);
        }
        return arr;
    }

    public static String[] paramCase(String[] arr) {
        for (String b :
                arr) {
            System.out.println("PrintArray: " + b);
        }
        return arr;
    }
}
