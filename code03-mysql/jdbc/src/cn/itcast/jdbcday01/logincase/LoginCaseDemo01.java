package cn.itcast.jdbcday01.logincase;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/9/1 17:29
 * @version: 1.0
 */

import cn.itcast.jdbcday01.jdbcultis.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * 登陆验证小功能:
 * 在数据库中查找到对应用户名和密码, 找到数据则提示
 *
 * @author Rekol
 */
public class LoginCaseDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input your username: ");
        String username = sc.nextLine();
        System.out.println("please input your password: ");
        String password = sc.nextLine();
        /* 1. 传入数据, 验证登陆*/
        login(username, password);

    }

    private static void login(String username, String password) {
        Connection conn = null;
        try {
            /* 2. 注册驱动, 创建连接 */
            conn = JDBCUtils.getConnection();
            /* 4. 获取执行对象prepareStatement, 预编译 sql 语句.*/
			// todo logincase
            PreparedStatement pst = conn.prepareStatement("selcet ");
            pst.setObject(1,"fromIDEA");
            int i = pst.executeUpdate();
            System.out.println(i);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
