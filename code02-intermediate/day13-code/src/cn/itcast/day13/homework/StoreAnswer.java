package cn.itcast.day13.homework;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/7/31 20:59
 * @version: 1.0
 */

public class StoreAnswer {


    public static void main(String[] args) {
        Student s1 = new Student("张三", 18, "男");
        Student s2 = new Student("李四", 19, "男");
        Student s3 = new Student("王五", 20, "男");
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        for (int i = 0; i < list.size(); i++) {
            /*知道最大年龄,进行设置姓名*/
            if (list.get(i).getAge() == Ite(list)) {

                list.get(i).setName("小猪佩奇");
                System.out.println("年龄最大的学生是:" + list.get(i));
            }
        }
    }

    public static int Ite(ArrayList<Student> list) {
        Iterator<Student> it = list.iterator();
        /*存储年龄最大值*/
        int max = 0;
        while (it.hasNext()) {
            /*获取年龄*/
            int num = it.next().getAge();
            /*获取到的年龄大于前一个的年龄, 则赋值得到最大年龄*/
            if (num > max) {
                max = num;
            }
        }

        return max;
    }
}

