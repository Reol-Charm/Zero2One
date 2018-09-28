package me.rekolcharm.selftaughtbook;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/7/26 11:41
 * @version: 1.0
 */

public class Father {
    String name = "Father";

    public static void say() {
        System.out.println("father say()");

    }

    public void say1() {
        System.out.println("father say1()");
    }

    public static void main(String[] args) {
        Father son = new Son();
        son.say1();
//        dynamic binding.
        System.out.println("name = " + son.name);
//        static binding
        son.say();
    }
}

