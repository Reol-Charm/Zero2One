package me.reolcharm.exam.ex090418;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author: Reol Charm
 * @CreateDate: 2018/9/4 20:01
 * @Description:
 */

public class UserJDBCnotTemplate {
    public UserBean login(String name, String password) {
        ResultSet rs = null;
        UserBean userBean = null;
        ArrayList<UserBean> userBeanArrayList = new ArrayList<>();
        try {
            Connection conn = JDBCUtils.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("select * from user where name=?,password=?");
            pstmt.setString(1, name);
            pstmt.setString(2, password);
            rs = pstmt.executeQuery();
            /* 如果查到了数据, 则返回 userBean */
            while (rs.next()) {
                userBean.setName(rs.getString("name"));
                userBean.setPassword(rs.getString("password"));
                userBeanArrayList.add(userBean);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return userBeanArrayList.get(0);
    }

    public static void main(String[] args) {

    }

    public void login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("   请输入用户名: ");
        String name = sc.nextLine();
        System.out.println("   请输入密码: ");
        String password = sc.nextLine();

        UserJDBCnotTemplate ujct = new UserJDBCnotTemplate();
        UserBean userBean = ujct.login(name, password);
    }
}
