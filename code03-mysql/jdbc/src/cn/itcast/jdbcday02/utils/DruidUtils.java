package cn.itcast.jdbcday02.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/9/2 11:30
 * @version: 1.0
 */

public class DruidUtils {
    private static Properties pro = null;
    private static DataSource ds = null;

    /** 一: 创建连接池, */
    /* 需要在 静态代码块 中初始化连接池, 才好在方法中直接调用, 获取连接 */
    static {
        try {
            /* 1.1 创建 properties 对象*/
            pro = new Properties();
            /* 1.2 加载文件,
            注意: 只有 druid.properties 文件在 src 目录下才能这样.
                 否则, 只能绝对路径, 或者在项目根目录下时,相对路径.*/
            pro.load(DruidUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
            /* 1. 传入 pro 对象, 加载文件内的 注册驱动, 连接数据库等操作, 最终返回连接池接口 Datasource */
            ds = DruidDataSourceFactory.createDataSource(pro);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 二: 从连接池获取连接对象.
     */
    public static Connection getConnection() throws SQLException {
        /* 2. 利用 Druid 中对 DataSource 的实现调用方法, 从连接池获取连接, 并返回给方法调用处.*/
        return ds.getConnection();
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
        return ds;
    }
}

