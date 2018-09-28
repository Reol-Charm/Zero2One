package cn.itcast.day13.homework;

/**
 * @Description:
 * @Author: Rekol
 * @CreateDate: 2018/7/31 20:15 - 21:19
 * @version: 1.0
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 二、定义一个学生类Student，包含三个属性姓名、年龄、性别，创建三个学生对象存入ArrayList集合中。
 * A：使用迭代器遍历集合。
 * B：求出年龄最大的学生，然后将该对象的姓名变为：小猪佩奇。
 */
class Student {
    private String name;
    private int age;
    private String sex;

    public Student() {
    }

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

public class Test02 {
    public static void main(String[] args) {
        /*创建三个学生对象存入ArrayList集合中。
         * A：使用迭代器遍历集合。
         * B：求出年龄最大的学生，然后将该对象的姓名变为：小猪佩奇。*/
        Student s1 = new Student("Hell", 23, "male");
        Student s2 = new Student("o Wor", 35, "female");
        Student s3 = new Student("Ld!!!", 33, "male");

        Collection<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        /** Collection 中的 iterator() 方法*/

        for (int i = 0; i < list.size(); i++) {
            if (((ArrayList<Student>) list).get(i).getAge() == getMax(list)) {
                ((ArrayList<Student>) list).get(i).setName("小猪佩奇");
                System.out.println("年龄最大的学生是:" + ((ArrayList<Student>) list).get(i));
            }
        }
    }

    private static int getMax(Collection<Student> list) {
        Iterator<Student> its = list.iterator();
        /*int max = ((ArrayList<Student>) list).get(0).getAge();*/
        int max = 0;
//        int num = its.next().getAge();    Wrong!!!
        /*int index = 0;*/                  //原本打算借助索引值
        /*String maxStr = "";*/

        while (its.hasNext()) {
            int num = its.next().getAge();
            if (max < num) {
                max = num;

                //                index++;
               /* maxStr = its.next().getName();
                System.out.println("maxStr = " + maxStr);
            }
            its.next();*/

            }
        }
        return max;


    }
}

