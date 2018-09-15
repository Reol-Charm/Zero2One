package cn.itcast.day06.verification;

/**
 * @Description:验证引用传递: 在一个类中接收本类对象的实例
 * @Author: Rekol
 * @CreateDate: 2018/7/15 17:06
 * @version: 1.0
 * @Scope / applicability: 在关于对象比较操作时才会使用
 */
class Demo {
    private int temp = 30;

    public Demo() {//创建对象.
    }

    public void fun(Demo d2) {
        d2.temp = 60;
    }

    public int fun02(Demo d2) {//直接通过对象调用本类的私有成员变量. 也佐证了引用传递的无限引用
        d2.temp = 70;
        return temp;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
}

public class CiteItself {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.setTemp(50);
        System.out.println("d1 = " + d1);
        System.out.println("temp = " + d1.getTemp());
        d1.fun(d1);
        System.out.println("d1.getTemp() = " + d1.getTemp());
        d1.fun02(d1);
        System.out.println("d1.fun02(d1) = " + d1.fun02(d1));
        System.out.println("d1.getTemp() = " + d1.getTemp());
    }
}
