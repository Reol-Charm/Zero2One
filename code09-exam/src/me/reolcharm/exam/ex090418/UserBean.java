package me.reolcharm.exam.ex090418;

/**
 * @Author: Reol Charm
 * @CreateDate: 2018/9/4 16:51
 * @Description:
 */

public class UserBean {
    /**
     * 1. 4）创建表对应的实体类：
     * User包含上表中所有的属性，
     * 包含getter和setter方法，实现toString()方法。
     */
    private int id;
    private String name;
    private String password;

    @Override
    public String toString() {
        return "UserBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
