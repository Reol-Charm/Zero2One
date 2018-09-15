package cn.itcast.jdbcday01.bean;

import cn.itcast.jdbcday01.bean.StuBeans;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/31 15:13
 * @version: 1.0
 */

public class DoStuTable {
    public static void main(String[] args) {
        /* 1. 启动驱动*/
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        try {
//            ClassNotFoundException: com.mysql.jdbcday02.driver
            Class.forName("com.mysql.jdbc.Driver");
            /*2. 获取连接对象*/
//            conn = DriverManager.getConnection("jdbcday02:sql:\\localhost:3306", "root", "root");
            conn = DriverManager.getConnection("jdbcday02:mysql://localhost:3306/db2nd","root","root");
            System.out.println("conn = " + conn);
            String sql = "select * from stu01";
            /* 3. 获取sql执行对象 stam*/
            stat = conn.createStatement();
            /* 4. 执行sql*/
            rs = stat.executeQuery(sql);
            StuBeans sbs = null;
            List<StuBeans> list = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("id");
                String stu_name = rs.getString("stu_name");
                int stu01_stu_fk = rs.getInt("stu01_stu_fk");
                sbs = new StuBeans();
                sbs.setId(id);
                sbs.setFk(stu01_stu_fk);
                sbs.setName(stu_name);

                list.add(sbs);
            }

            System.out.println("list = " + list);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
