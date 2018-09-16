package me.reolcharm.exam.ex090418;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @Author: Reol Charm
 * @CreateDate: 2018/9/4 15:42
 * @Description:
 */

public class JDBCUtils {
    /** 1. 导包: Druid 必须的 DataSource 接口实现类和 mysql 提供的DriverManager类, 并 "add as library "*/
    /** 2. 配置 druid 必须的加载文件. 最好放在 src 文件夹下, 方便调用类加载器, 加载配置文件.
     * driverClassName
     * url
     * username
     * password
     * initialSize
     * maxActive
     * maxWait*/
    /**
     * 3. 创建连接池, 逆推需 加载配置文件的 properties 对象
     */
    private static Properties pro = null;

    private static DataSource ds = null;


    static {
        pro = new Properties();
        /** 3.1 加载 properties 文件:
         * 调用当前类的类加载器在类路径下(src)下加载 properties 文件*/
        try {
            pro.load(JDBCUtils.class
                    .getClassLoader()
                    .getResourceAsStream("druid.properties"));

            /** 3.2 获取到 pro 对象后, 传入工厂类的创建连接池方法中, 创建连接池方法, */
            ds = DruidDataSourceFactory.createDataSource(pro);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    /**
     * 4. 返回连接对象方法.
     */
    public static Connection getConnection() throws Exception {
        return ds.getConnection();
        /* Wrong!!!DruidDataSourceFactory.createDataSource(pro);*/
        /* .getConnection();*/    /* 返回的是 DataSource 对象.*/
    }

    /**
     * 5. 关闭连接中所占资源.
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

    /**
     * 5.2 方法重载, 方便后续的关闭资源.
     */
    public static void close(Statement stmt, Connection conn) {
        close(null, stmt, conn);
    }

    /**
     * 6. 给 Spring 等框架添加获取连接池的方法;
     * 具体获取连接的方法由框架自己完成, 不用 Druid 获取连接池的方法.
     */
    public static DataSource getDataSource() {
        return ds;
    }
}
