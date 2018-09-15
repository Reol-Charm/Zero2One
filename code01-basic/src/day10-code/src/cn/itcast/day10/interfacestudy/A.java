package cn.itcast.day10.interfacestudy;

public interface A {
    public abstract void showA();

    public abstract void show();


    public default void defaultA() {
    }

    public default void defaultMe() {
    }

}
