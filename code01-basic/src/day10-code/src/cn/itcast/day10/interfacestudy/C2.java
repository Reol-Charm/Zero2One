package cn.itcast.day10.interfacestudy;

public interface C2 extends A2,B2 {
    @Override
    default void method() {
        System.out.println("Default keyword is preserved");
    }
}
