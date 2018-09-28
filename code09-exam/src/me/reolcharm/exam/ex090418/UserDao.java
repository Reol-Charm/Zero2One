package me.reolcharm.exam.ex090418;

import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @Author: Reol Charm
 * @CreateDate: 2018/9/4 16:53
 * @Description: 实现查询方法的方法类.
 */

public class UserDao {
    private UserBean user;

    /**
     * 使用 JDBCTemplate 进行查询操作.
     */

    /*1. 导入JDBCTemplate 所需的包, 并 "add as library"*/
    public UserBean login(String name, String password) {

        if (name == null || password == null) {
            return null;
        }

        /* 2. 传入连接池对象, 获取到能执行 sql 的 JdbcTemplate 对象 */
        JdbcTemplate jtemp = new JdbcTemplate(JDBCUtils.getDataSource());
        /* 3. 定义 sql 语句*/
        String sql_query = "select name,password from user where name=?,password=?";
        /* 4. 执行 sql 语句 */
        List<UserBean> userBeanList = jtemp.query(sql_query,
                new BeanPropertyRowMapper<UserBean>(UserBean.class),
                name, password);

        /* 5. 遍历 userbean 集合, .*/
        for (UserBean userBean : userBeanList) {
            if (name.equals(userBean.getName())
                    && password.equals(userBean.getPassword())) {
                System.out.println("登陆成功!! 欢迎您! " + userBean.getName());
                return userBean;
            } else {
                System.out.println("账户不存在或者密码错误, 请重新输入.");
                return null;
            }
        }
        return user;
    }

























    /* 方法中需要返回实例类, 但返回 */

    @Test
    public void createTest() {
        JdbcTemplate jtemp = new JdbcTemplate(JDBCUtils.getDataSource());
        /** 3. 定义 sql 语句*/
        String sql_create = "create table user";
        int update = jtemp.update(sql_create);
//         ClassNotFoundException: "com.mysql.jdbc.Driver"      dataSource init error
//        Wrong!!! 配置文件中的 driverClassName 的键值对"画蛇添足"了.加了""符号.
//        Wrong!!! Access denied for user ''@'localhost' (using password: YES)
//        username 写错了, 少写了个 s...
        System.out.println("update = " + update);
    }
}
