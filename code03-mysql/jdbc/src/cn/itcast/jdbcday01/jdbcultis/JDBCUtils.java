package cn.itcast.jdbcday01.jdbcultis;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/31 17:14
 * @version: 1.0
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

/**
 * 1. 避免被实例化方法:
 * 1. 将类设置成 抽象类
 * 2. 私有化构造
 */
public abstract class JDBCUtils {
    /**
     * 2.3
     */
    private static String url = null;
    private static String username = null;
    private static String password = null;
    private static String driver = null;

    /*
     * 2. 静态代码块 启动一次:
     *      1.读取properties 文件中的url等
     *      2.注册*/
    static {
        try {
            /* 2.1 创建Properties集合类 */
            Properties pro = new Properties();

            /* 写法一:
            获取src路径(类路径)下的文件的方式--->ClassLoader 类加载器*/
            /*如果properties文件没有在src文件下, 则会报错, 此写法就不能用.*/
            /*每次只需要更改 properties 文件下数据库.*/
            ClassLoader classLoader = JDBCUtils.class.getClassLoader();
            URL res = classLoader.getResource("jdbc.properties");
            String path = res.getPath();
            /* 写法三: 普通常规写法.相对路径: 相对于 project 的路径. */
            /*写法二:
            pro.load(JDBCUtils.class.getResourceAsStream("jdbcday02.properties"));*/


            pro.load(new FileReader(path));
            /*mysql\\jdbcday02\\*/

            /* 2.2 读取 Properties 中内容*/
            url = pro.getProperty("url");
            username = pro.getProperty("username");
            password = pro.getProperty("password");
            driver = pro.getProperty("driver");

            /* 3. 注册驱动*/
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 4. 利用方法, 返回适合的 connection 连接.
     */
    public static Connection getConnection() throws SQLException {
        /* 不想传参数, 就得用静态代码块提前解析并获取到url,等值.*/
        return DriverManager.getConnection(url, username, password);
    }

    /**
     * 5. 复用connect, statement, resultSet 对象.
     */
    public static void close(Connection conn, Statement stat, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
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

    }
}
