package cn.itcast.day09.practice_redpacket_afer_littletest;
/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/20 16:24
 * @version:         1.0
 *
 */

public class Super {
    private String name;
    private double balance;

    public Super() {
    }

    public Super(String name, double balance) {
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
        System.out.println("name = " + getName() + "; balance = " + getBalance());
    }
}
