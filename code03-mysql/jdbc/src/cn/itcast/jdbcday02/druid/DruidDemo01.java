package cn.itcast.jdbcday02.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.Properties;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/9/2 11:04
 * @version: 1.0
 */

public class DruidDemo01 {
    public static void main(String[] args) throws Exception {
        demo01();
    }

    private static void demo01() throws Exception {
        /* 1. 创建连接池.*/
//        DruidDataSourceFactory.createDataSource("druid.properties");
        /* 位置无所谓,建议放在*/
        /* 硬编码, 自己手动设置,不建议,所以用加载配置.*/
        Properties pro = new Properties();
//        NullPointerException: inStream parameter is null.
//        pro.load(DruidDemo01.class.getResourceAsStream("druid.properties"));
        pro.load(DruidDemo01.class.getClassLoader().getResourceAsStream("druid.properties"));
        /* druit 通过工厂类获取到 连接池 对象*/
        DataSource ds = DruidDataSourceFactory.createDataSource(pro);
//        GetConnectionTimeoutException: wait millis 3000, active 10
        for (int i = 0; i < 11; i++) {
            Connection conn = ds.getConnection();
            System.out.println(i + "conn = " + conn);
            /*if(i %2 ==0){
                conn.close();
            }*/
        }
    }
}
