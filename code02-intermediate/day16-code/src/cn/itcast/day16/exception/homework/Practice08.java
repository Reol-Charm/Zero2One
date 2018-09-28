package cn.itcast.day16.exception.homework;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/8/6 19:49 - 20: 29 - 20:45
 * @version: 1.0
 */

class Student {
    private Integer num;
    private String name;
    private Integer record;

    public Student() {
    }

    public Student(Integer num, String name, Integer record) {
        this.num = num;
        this.name = name;
        this.record = record;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRecord() {
        return record;
    }

    public void setRecord(Integer record) {
        /*if (new Student().getRecord() < 0) {
            throw new NumberSmallerThan0Exception("分数永远不能为负数");
        }*/
        if (record < 0) {
            throw new NumberSmallerThan0Exception("分数不能为空");
        } else {
            this.record = record;
        }
    }
}

/*请使用代码实现
每一个学生(Student)都有学号,姓名和分数,分数永远不能为负数
如果老师给学生赋值一个负数,抛出一个自定义异常
// 怎么添加自定义异常类, 并运用.
*/
public class Practice08 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setRecord(100);
        try {
            s.setRecord(-1);
        } catch (NumberSmallerThan0Exception n) {
            n.printStackTrace();
        }
    }

    /*private static void setRecord(Student s) {
        try {
            s.setRecord(-1);
        } catch (NumberSmallerThan0Exception n) {
            n.printStackTrace();
        }
    }*/

}
