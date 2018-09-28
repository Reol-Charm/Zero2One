package cn.itcast.day18.oncourse.Baozi01;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/9 16:39
 * @version: 1.0
 */

public class Goods {
    private String bread;
    private boolean flag = false;


    public Goods() {
    }

    public Goods(String bread, boolean flag) {
        this.bread = bread;
        this.flag = flag;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
