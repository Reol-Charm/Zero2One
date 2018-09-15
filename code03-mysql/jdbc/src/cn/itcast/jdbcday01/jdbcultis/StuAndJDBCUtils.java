package cn.itcast.jdbcday01.jdbcultis;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/31 19:32
 * @version: 1.0
 */

public class StuAndJDBCUtils {
    public static void main(String[] args) {
        ResultSet rset = null;
        PreparedStatement pstm = null;
        Connection conn = null;
        /* 7.1 创建集合, 保存javaBean的实例对象*/
        ArrayList<StuBeans> list = new ArrayList<>();
        try {
            /* 1. 利用创建的JDBCUtils 创建连接, 两步变一步 */
            conn = JDBCUtils.getConnection();
            /* 2. 书写 sql 语句*/
            String sql = "select * from stu01";
            /* 3. 获取执行对象*/
            pstm = conn.prepareStatement(sql);
            /* 4. 执行 sql 语句*/
            rset = pstm.executeQuery();
            /* 6.1 创建 javaBean 类对象.*/
            StuBeans sBs = new StuBeans();

            /* 5. 对结果集进行处理:
             *   boolean next(): 游标向下移动一位, 判断是否有数据, 有则返回true*/
            while (rset.next()) {
                /* 5.1 利用 结果集类中方法, 获取到列名.*/
                int id = rset.getInt("id");
                String stu_name = rset.getString("stu_name");
                int fk = rset.getInt("stu01_stu_fk");
                /* 6. 将一行数据添加至 java bean 类中:*/
                sBs.setId(id);
                sBs.setName(stu_name);
                sBs.setFk(fk);
                /* 7. 将javaBean 类保存表中数据的每个实例对象 保存到集合中*/
                list.add(sBs);
                System.out.println("listwhile = " + list);
            }
            System.out.println("list = " + list);
        } catch (SQLException e) {
            e.printStackTrace();
            /* 8. 释放资源*/
        } finally {
            JDBCUtils.close(conn,pstm,rset);
        }

    }
}
