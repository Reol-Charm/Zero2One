package cn.itcast.jdbcday01.jdbcultis;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/31 15:10
 * @version: 1.0
 */

public class StuBeans {
    private int id;
    private String name;
    private int fk;

    @Override
    public String toString() {
        return "cn.itcast.jdbcday01.bean.Stu01Bean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fk=" + fk +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFk() {
        return fk;
    }

    public void setFk(int fk) {
        this.fk = fk;
    }
}
