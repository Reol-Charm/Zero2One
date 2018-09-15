package cn.itcast.day10.interfacestudy;

public interface MyFirstInterface {
    public static final int FIRST_NUMBER = 10;

    public abstract String showAbsMethod();

    public default void showDefaultMethod() {
        System.out.println("FIRST_NUMBER = " + FIRST_NUMBER);
    }

    public static void showStaticMethod() {
        String str = "";
        System.out.println("str = " + str);
    }
     default void showDefaultMethod02() {
        showPrivateMethod();
    }
     default void showPrivateMethod() {
        System.out.println("私有默认方法");
    }
}

