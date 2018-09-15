package cn.itcast.day06.classandinstance;

public class Phone {
    String name = "Apple";
    double price = 8888.0;
    String color = "blue";

    public void call(String who) {
        System.out.println("call sb.: " + who);
    }
    public void sendMassage() {
        System.out.println("SEND MASSAGE");
    }
}
