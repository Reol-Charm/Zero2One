package cn.itcast.jdbcday02.springjdbctemplate;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/31 15:10
 * @version: 1.0
 */

public class Stu01Bean {
    //    private int id;
//    private String name;
//    private int fk;
//    private Double sal;
    private int id;
    private String stu_name;
    private int stu01_stu_fk;
    private Double sal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public int getStu01_stu_fk() {
        return stu01_stu_fk;
    }

    public void setStu01_stu_fk(int stu01_stu_fk) {
        this.stu01_stu_fk = stu01_stu_fk;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Stu01Bean{" +
                "id=" + id +
                ", stu_name='" + stu_name + '\'' +
                ", stu01_stu_fk=" + stu01_stu_fk +
                ", sal=" + sal +
                '}';
    }
}
