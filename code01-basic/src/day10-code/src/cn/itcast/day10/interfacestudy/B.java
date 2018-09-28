package cn.itcast.day10.interfacestudy;

public interface B {
    public abstract void showB();

    public abstract void show();


    public default void defaultB() {
    }

    public default void defaultMe() {
    }


}
