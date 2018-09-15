package cn.itcast.day18.oncourse.Baozi02;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/9 19:35
 * @version: 1.0
 */

public class Goods01 {
    private String outer;
    private String inner;
    private boolean flag;

    public Goods01() {
    }

    public Goods01(String outer, String inner) {
        this.outer = outer;
        this.inner = inner;
    }

    public Goods01(String outer, String inner, boolean flag) {
        this.outer = outer;
        this.inner = inner;
        this.flag = flag;
    }

    public String getOuter() {
        return outer;
    }

    public void setOuter(String outer) {
        this.outer = outer;
    }

    public String getInner() {
        return inner;
    }

    public void setInner(String inner) {
        this.inner = inner;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

}
