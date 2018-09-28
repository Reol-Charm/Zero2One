package cn.itcast.jdbcday02.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/9/2 14:56
 * @version: 1.0
 */

public class C3P0Utils {
    private static ComboPooledDataSource cpds;

    /** 一: c3p0 中实现类*/
    static {
        cpds = new ComboPooledDataSource();
    }

    public static Connection getConnection() throws SQLException {
        return cpds.getConnection();
    }

    /**
     * 三: 关闭相应资源
     */
    public static void close(ResultSet rs, Statement stmt, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stmt != null) {
            try {
                stmt.close();
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

    }

    public static void close(Statement stmt, Connection conn) {
        close(null, stmt, conn);
    }

    /**
     * 四: 为某些框架获取连接池
     */
    public static DataSource getDataSource() {
        return cpds;
    }
}
