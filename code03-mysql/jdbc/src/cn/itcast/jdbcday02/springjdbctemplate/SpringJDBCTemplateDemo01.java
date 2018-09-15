package cn.itcast.jdbcday02.springjdbctemplate;

import cn.itcast.jdbcday02.utils.DruidUtils;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/9/2 15:20
 * @version: 1.0
 */

public class SpringJDBCTemplateDemo01 {
    /* 1. 导包*/
    /* 2. 创建JDBCTemplate*/
    public static void main(String[] args) {
        JdbcTemplate jt = new JdbcTemplate(DruidUtils.getDataSource());
        /* 3. sql 语句*/
        String sql_update = "insert into stu01(id,stu_name,stu01_stu_fk) values (?,?,?)";
        int hapyDog = jt.update(sql_update, null, "HapyDog", null);
        System.out.println("hapyDog = " + hapyDog);

    }
}
