package cn.itcast.jdbcday02.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/9/2 10:05
 * @version: 1.0
 */

public class C3P0demo01 {
    public static void main(String[] args) throws SQLException {

        testName();
    }

    private static void test01() throws SQLException {
        /* 1. 创建连接池*/
        DataSource cpds = new ComboPooledDataSource();
        for (int i = 0; i < 10; i++) {
//        for (int i = 0; i < 13; i++) {
            /* 2. 获取10个连接*/
            Connection conn = cpds.getConnection();
            System.out.println(i + "conn = " + conn);
            /* 获取第十一个连接
            An attempt by a client to checkout a Connection has timed out.*/
            if (i % 3 == 0) {
                /* 归还连接, 有归还的话, 就不会报上述错误, 连接池中始终有连接.*/
                conn.close();
            }
        }
    }

    private static void testName() throws SQLException {
        /* 1. 创建指定配置的连接池.*/
        DataSource ds = new ComboPooledDataSource("Secondc3p0");
        Connection conn = ds.getConnection();
        for (int i = 0; i < 5; i++) {
            /* 2. 获取连接*/
            Connection conn02 = ds.getConnection();
            System.out.println(i + "conn = " + conn);
        }

        String sql_query = "select ? from dept;";
        /*3. 获取预编译 执行对象*/
        PreparedStatement pstmt = conn.prepareStatement(sql_query);
        /* 4. 设置值*/
        pstmt.setString(1,"dname");
        ResultSet rs = pstmt.executeQuery();
        while(rs.next()){
            String dname = rs.getString("dname");
            System.out.println("dname = " + dname);
        }

    }
}
