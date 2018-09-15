package papare4exam.javeee15secondexam.test01;

public interface Bluetooth {
    public abstract void btFunction();

    public default void connecting() {
        System.out.println("can connect bluetooth.");
    }
}
