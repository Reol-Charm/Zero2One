package cn.itcast.day10.interfacestudy;

public interface LiveAble {
    public default void fly() {
        System.out.println("Fly in the sky.");
    }
    public static void run() {
        System.out.println("Have to run.");
    }
}
