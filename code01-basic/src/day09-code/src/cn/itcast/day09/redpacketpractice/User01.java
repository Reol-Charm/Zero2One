package cn.itcast.day09.redpacketpractice;
/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/19 20:57
 * @version:         1.0
 *
 */

public class User01 {
    private String name;
    private double balance;

    public User01() {
    }

    public User01(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void show() {
        System.out.println("Name: " + getName() + "; Balance: " + balance);
    }
}
