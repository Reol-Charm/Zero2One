package cn.itcast.day09.extendsexercise;/*@Description:
 * @Author:          Rekol
 * @CreateDate:      2018/7/19 20:39
 * @version:         1.0
 *
 */

import java.util.ArrayList;
import java.util.Scanner;

public class DemoRedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("Manager", 500);

        Scanner sc = new Scanner(System.in);

        System.out.println("Please input the money you will send: ");
        int money = sc.nextInt();
        System.out.println("Please input how many red packets you wanna send: ");
        int count = sc.nextInt();


//        send the red packet.
        ArrayList<Double> sendList = manager.send(money, count);

//        judge, if do not have enough money.
        if (sendList == null) {
            System.out.println("余额不足");
            return;
        }


        Member m = new Member();
        Member m2 = new Member();
        Member m3 = new Member();

        manager.show();
        m.show();
        m2.show();
        m3.show();
        System.out.println("=================");

        m.openRedPacket(sendList);
        m2.openRedPacket(sendList);
        m3.openRedPacket(sendList);

        manager.show();
        m.show();
        m2.show();
        m3.show();
    }
}
