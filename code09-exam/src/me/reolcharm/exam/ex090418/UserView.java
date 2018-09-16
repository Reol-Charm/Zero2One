package me.reolcharm.exam.ex090418;

import java.util.Scanner;

/**
 * @Author: Reol Charm
 * @CreateDate: 2018/9/4 19:33
 * @Description:
 */

public class UserView {
    public static void main(String[] args) {
        UserView uv = new UserView();
        uv.login();
    }

    public void login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("   请输入用户名: ");
        String name = sc.nextLine();
        System.out.println("   请输入密码: ");
        String password = sc.nextLine();

        UserDao ud = new UserDao();
        ud.login(name, password);
    }

}
