package cn.itcast.jdbcday02.springjdbctemplate;

import cn.itcast.jdbcday02.utils.DruidUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/9/2 17:07
 * @version: 1.0
 */
public class JdbcTemplatePractice01 {


    public static void main(String[] args) {
        command01();
    }

    private static void command01() {
        JdbcTemplate tje = new JdbcTemplate(DruidUtils.getDataSource());
//         StatementCallback;
// uncategorized SQLException for SQL [alter table stu01 change stu01_stu_fk fk int];
// SQL state [HY000]; error code [1025];
// Error on rename of '.\db2nd\#sql-da4_a9' to '.\db2nd\stu01' (errno: 150);
// nested exception is java.sql.SQLException: Error on rename of '.\db2nd\#sql-da4_a9' to '.\db2nd\stu01' (errno: 150)
//        删除外键时上述错误, 外键约束...

        /* JDBCTemplate 进行 DML 操作*/
        int update = tje.update("update stu01 set sal = ? where id = ?", 120, 2);

//        tje.update("insert into stu01 values (null,'Emma',2,4500),(null,'Frank',1,8000)");

        tje.update("delete from stu01 where id in(14)");
        /* 返回影响的行数. */
        System.out.println("update = " + update);


        /* JdbcTemplate 进行 DQL 操作. 暂时三种情况需要熟悉.
         * 一: 查询返回单列单值:@queryForObject
         * 1.1 返回查询到的某个值.
         * 注意点: 第二个参数 --> 返回的单值所对应的 class 类型,
         */
        String sql_query = "select stu_name from stu01 where id = ?";
        String str = tje.queryForObject(sql_query, String.class, 2);
        System.out.println("sTRING = " + str);

        /* 1.2 返回聚合函数的结果.*/
        String sql_Function = "select max(sal) from stu01 where sal < ?";
        Integer i = tje.queryForObject(sql_Function, Integer.class, 5000);
//        i = 4; 直接返回结果了!   i = 4500
        System.out.println("i = " + i);


        /* 2. 返回单个Bean对象 */
        Stu01Bean bean = tje.queryForObject(
//                bean = Stu01Bean{id=0, stu_name='Frank', stu01_stu_fk=0, sal=null}
//                "select stu_name from stu01 where sal > ?",
                "select * from stu01 where sal > ?",
                new BeanPropertyRowMapper<Stu01Bean>(/*-->*/Stu01Bean.class), 5000);
//        IllegalStateException: Mapped class was not specified
//          --> 缺少参数 Class<T> cls
//          --> 格式: queryForObject(String sql,new BeanPropertyRowMapper<T>(Class<T> cls),Object... args);
//        bean = cn.itcast.jdbcday01.bean.Stu01Bean{id=0, name='null', fk=0}
//        --> 没有值 -->Bean中没有完全的包含表中所有列名称.
//
        System.out.println("bean = " + bean);


        /* 3. 返回实体bean的集合
         * @method: query()
         * */
        List<Stu01Bean> beanList = tje.query("select * from stu01 where stu01_stu_fk = ?",
                new BeanPropertyRowMapper<Stu01Bean>(Stu01Bean.class), 1);
//        beanList = [Stu01Bean{id=1, name='null', fk=0, sal=100.0}, ...]
//        --> 字段名称与列名称不一致???
//        --> 确实! [Stu01Bean{id=1, stu_name='hello', stu01_stu_fk=1, sal=100.0}...]
        System.out.println("beanList = " + beanList);


    }
}
