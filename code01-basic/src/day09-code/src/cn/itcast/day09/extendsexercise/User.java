package cn.itcast.day09.extendsexercise;
/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/19 19:11
 * @version:         1.0
 *
 */

public class User {
    private String name;
    private double money;


    public User() {
    }

    public User(String username, double leftMoney) {
        this.name = username;
        this.money = leftMoney;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void show() {
        System.out.println("My name is: " + getName()
                + "And I have: " + getMoney() + " dollar.");
    }
}

