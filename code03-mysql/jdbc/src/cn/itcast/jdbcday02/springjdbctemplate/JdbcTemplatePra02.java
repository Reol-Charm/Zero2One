package cn.itcast.jdbcday02.springjdbctemplate;

import cn.itcast.jdbcday02.utils.DruidUtils;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @Author: Reol Charm
 * @CreateDate: 2018/9/2 21:19
 * @Description:
 */

public class JdbcTemplatePra02 {
    /**
     * 4. 练习：
     * 需求：
     * 1. 修改1号数据的 salary 为 10000
     * 2. 添加一条记录
     * 3. 删除刚才添加的记录
     * 4. 查询id为1的记录，将其封装为Map集合
     * 5. 查询所有记录，将其封装为List
     * 6. 查询所有记录，将其封装为Emp对象的List集合
     * 7. 查询总记录数
     */

    /* 导包: junit4, @Test 大写T
     * */
    // todo 装饰者模式, 自定义连接池, 反射机制.
    @Test
    public void test01() {
        JdbcTemplate jdbctemp = new JdbcTemplate(DruidUtils.getDataSource());
        String s = jdbctemp.queryForObject("select stu_name from stu01 where sal > 7000", String.class);
        System.out.println("s = " + s);
    }
}
