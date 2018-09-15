package cn.itcast.day04.loopexercise;
/*题目要求：
比较两个数据是否相等。
参数类型分别为两个byte类型，两个short类型，两个int类型，两个long类型，
并在main方法中进行测试。*/
public class MethodOverloadSame02 {
    public static void main(String[] args) {
        System.out.println(isSame((int)21,39L));
    }

    public static boolean isSame(int o, int j) {
        System.out.println("int");

        return o == j;
    }
    public static boolean isSame(byte o, byte j) {
        boolean comp = (o == j ? true : false);
        System.out.println("byte");
        return comp;
    }
    public static boolean isSame(short o, short j) {
        System.out.println("short");

        if (o == j) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isSame(long c , long g) {
        System.out.println("long");

        boolean same;
        if (c == g) {
            same = true;
        } else {
            same = false;
        }
        return same;
    }
}